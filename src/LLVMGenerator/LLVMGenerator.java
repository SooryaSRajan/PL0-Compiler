package LLVMGenerator;

import java.util.HashSet;
import java.util.Stack;

class LLVMGenerator {
    static int reg = 1;

    private static String header_text = "";
    private static String main_text = "";
    private static String buffer = "";
    private static int str_i = 0;
    private static int main_reg = 1;
    private static int br = 0;

    static Stack<Integer> br_stack = new Stack<>();

    static String generate() {
        main_text += buffer;
        formatMainText();
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
        text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
        text += "\n";
        text += header_text;
        text += "define i32 @main() nounwind {\n";
        text += main_text;
        text += "  ret i32 0\n";
        text += "}\n";
        return text;
    }

    // functions
    static void function_start(String id, String returnType) {
        main_text += buffer;
        main_reg = reg;
        buffer = "define " + returnType + " @" + id + "() nounwind {\n";
        reg = 1;
    }

    //function with parameters
    static void function_start(String id, Value[] params, String returnType) {
        main_text += buffer;
        main_reg = reg;
        buffer = "define " + returnType + " @" + id + "(";

        //check for array too
        for (int i = 0; i < params.length; i++) {

            if (params[i].type == Value.VarType.INT) {
                buffer += "i32 %" + params[i].content;
            } else if (params[i].type == Value.VarType.FLOAT) {
                buffer += "double %" + params[i].content;
            } else if (params[i].type == Value.VarType.ARRAY) {
                if (params[i].typeOfArray == Value.VarType.INT) {
                    buffer += "i32* %" + params[i].content;
                } else if (params[i].typeOfArray == Value.VarType.FLOAT) {
                    buffer += "double* %" + params[i].content;
                }
            }
            if (i != params.length - 1) {
                buffer += ", ";
            }
        }


        buffer += ") nounwind {\n";
        reg = 1;

    }

    static void function_end() {
        buffer += "ret void\n";
        formatBuffer();
        buffer += "}\n\n";
        header_text += buffer;
        buffer = "";
        reg = main_reg;
    }

    //function_end returning a value
    static void function_end(String type, String var) {
        buffer += "ret " + type + " " + var + "\n";
        formatBuffer();
        buffer += "}\n\n";
        header_text += buffer;
        buffer = "";
        reg = main_reg;
    }

    static void call(String id) {
        buffer += "call void @" + id + "()\n";
    }

    //call function with parameters
    static void call(String id, String[] params) {
        buffer += "call void @" + id + "(";
        for (int i = 0; i < params.length; i++) {
            buffer += params[i];
            if (i != params.length - 1) {
                buffer += ", ";
            }
        }
        buffer += ")\n";
    }

    // printf
    static void print(String text) {
        int str_len = text.length();
        String str_type = "[" + (str_len + 2) + " x i8]";
        header_text += "@str" + str_i + " = constant" + str_type + " c\"" + text + "\\0A\\00\"\n";
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( " + str_type + ", " + str_type + "* @str" + str_i + ", i32 0, i32 0))\n";
        str_i++;
        reg++;
    }

    static void printf_i32(String id, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = load i32, i32* @" + id + "\n";
        } else {
            buffer += "%" + reg + " = load i32, i32* %" + id + "\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_double(String id, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = load double, double* @" + id + "\n";
        } else {
            buffer += "%" + reg + " = load double, double* %" + id + "\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_string(String id, int length, HashSet<String> globalNames, String function) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* @" + id + ", i32 0, i32 0\n";
        } else {
            buffer += "%" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* @" + function + "." + id + ", i32 0, i32 0\n";
        }
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
        reg++;
    }

    // scanf
    static void scanf_i32(String id, HashSet<String> globalNames) {
        assign_i32(id, "0", globalNames);
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* @" + id + ")\n";
        } else {
            buffer += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %" + id + ")\n";
        }
        reg++;
    }

    static void scanf_double(String id, HashSet<String> globalNames) {
        assign_double(id, "0.0", globalNames);
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* @" + id + ")\n";
        } else {
            buffer += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %" + id + ")\n";
        }
        reg++;
    }

    // declare
    static void declare_i32(String id, boolean global) {
        if (global) {
            header_text += "@" + id + " = global i32 0\n";
        } else {
            buffer += "%" + id + " = alloca i32\n";
        }
    }

    static void declare_double(String id, boolean global) {
        if (global) {
            header_text += "@" + id + " = global double 0.0\n";
        } else {
            buffer += "%" + id + " = alloca double\n";
        }
    }

    //declare array
    static void declare_array(String id, int length, boolean global) {
        if (global) {
            header_text += "@" + id + " = global [" + length + " x i32] zeroinitializer\n";
        } else {
            buffer += "%" + id + " = alloca [" + length + " x i32]\n";
        }
    }

    //assign array in index
    static void assign_array(String id, String index, String value, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = getelementptr inbounds [" + (Integer.parseInt(index) + 1) + " x i32], [" + (Integer.parseInt(index) + 1) + " x i32]* @" + id + ", i32 0, i32 " + index + "\n";
        } else {
            buffer += "%" + reg + " = getelementptr inbounds [" + (Integer.parseInt(index) + 1) + " x i32], [" + (Integer.parseInt(index) + 1) + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
        }
        reg++;
        buffer += "store i32 " + value + ", i32* %" + (reg - 1) + "\n";
    }

    //access array
    static void access_array(String id, String index, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = getelementptr inbounds [" + (Integer.parseInt(index) + 1) + " x i32], [" + (Integer.parseInt(index) + 1) + " x i32]* @" + id + ", i32 0, i32 " + index + "\n";
        } else {
            buffer += "%" + reg + " = getelementptr inbounds [" + (Integer.parseInt(index) + 1) + " x i32], [" + (Integer.parseInt(index) + 1) + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
        }
        reg++;
        buffer += "%" + reg + " = load i32, i32* %" + (reg - 1) + "\n";
        reg++;
    }

    static void declare_i32_constant(String id, int value, boolean global) {
        if (global) {
            header_text += "@" + id + " = global i32 " + value + "\n";
        } else {
            buffer += "%" + id + " = alloca i32, i32 " + value + "\n";
        }
    }

    static void declare_double_constant(String id, double value, boolean global) {
        if (global) {
            header_text += "@" + id + " = global double " + value + "\n";
        } else {
            buffer += "%" + id + " = alloca double, double " + value + "\n";
        }
    }


    // assign
    static void assign_i32(String id, String value, HashSet<String> globalNames) {
        if (globalNames != null && globalNames.contains(id)) {
            buffer += "store i32 " + value + ", i32* @" + id + "\n";
        } else {
            buffer += "store i32 " + value + ", i32* %" + id + "\n";
        }
    }

    static void assign_double(String id, String value, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "store double " + value + ", double* @" + id + "\n";
        } else {
            buffer += "store double " + value + ", double* %" + id + "\n";
        }
    }

    static void assign_string(String id, String text, boolean global, String function) {
        int len = text.length() + 1;
        String str_type = "[" + len + " x i8]";
        if (global) {
            header_text += "@" + id + " = constant" + str_type + " c\"" + text + "\\00\"\n";
        } else {
            header_text += "@" + function + "." + id + " = constant" + str_type + " c\"" + text + "\\00\"\n";
        }
    }

    // add
    static void add_i32(String val1, String val2) {
        buffer += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_double(String val1, String val2) {
        buffer += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // mul
    static void mul_i32(String val1, String val2) {
        buffer += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mul_double(String val1, String val2) {
        buffer += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // sub
    static void sub_i32(String val1, String val2) {
        buffer += "%" + reg + " = sub i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_double(String val1, String val2) {
        buffer += "%" + reg + " = fsub double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //div
    static void div_i32(String val1, String val2) {
        buffer += "%" + reg + " = sdiv i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void div_double(String val1, String val2) {
        buffer += "%" + reg + " = fdiv double " + val1 + ", " + val2 + "\n";
        reg++;
    }


    // load
    static void load_i32(String id, HashSet<String> globalNames) {
        if (globalNames != null && globalNames.contains(id)) {
            buffer += "%" + reg + " = load i32, i32* @" + id + "\n";
        } else {
            buffer += "%" + reg + " = load i32, i32* %" + id + "\n";
        }
        reg++;
    }

    static void load_double(String id, HashSet<String> globalNames) {
        if (globalNames.contains(id)) {
            buffer += "%" + reg + " = load double, double* @" + id + "\n";
        } else {
            buffer += "%" + reg + " = load double, double* %" + id + "\n";
        }
        reg++;
    }


    // if
    static void icmp(String id, String value, HashSet<String> globalNames) {
        load_i32(id, globalNames);
        buffer += "%" + reg + " = icmp eq i32 %" + (reg - 1) + ", " + value + "\n";
        reg++;
    }

    static void if_start() {
        br++;
        buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }

    static void if_end() {
        int b = br_stack.pop();
        buffer += "br label %false" + b + "\n";
        buffer += "false" + b + ":\n";
    }


    // repeat
    static void repeat_start(String ID, HashSet<String> globalNames, boolean isReal) {
        if (isReal) {
            load_double(ID, globalNames);
            fptosi("%" + (reg - 1));
        } else {
            load_i32(ID, globalNames);
        }

        int repetitions = reg - 1;

        declare_i32(Integer.toString(reg), false);
        int counter = reg;
        reg++;
        assign_i32(Integer.toString(counter), "0", null);

        br++;
        buffer += "br label %cond" + br + "\n";
        buffer += "cond" + br + ":\n";

        load_i32(Integer.toString(counter), null);
        add_i32("%" + (reg - 1), "1");
        assign_i32(Integer.toString(counter), "%" + (reg - 1), null);

        buffer += "%" + reg + " = icmp slt i32 %" + (reg - 2) + ", %" + repetitions + "\n";
        reg++;

        buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        br_stack.push(br);
    }

    static void repeat_end() {
        int b = br_stack.pop();
        buffer += "br label %cond" + b + "\n";
        buffer += "false" + b + ":\n";
    }


    static void sitofp(String id) {
        buffer += "%" + reg + " = sitofp i32 " + id + " to double\n";
        reg++;
    }

    static void fptosi(String id) {
        buffer += "%" + reg + " = fptosi double " + id + " to i32\n";
        reg++;
    }


    // helpers
    private static void formatBuffer() {
        String[] lines = buffer.split("\n");
        StringBuilder sb = new StringBuilder();
        sb.append(lines[0]).append("\n");
        for (int i = 1; i < lines.length; i++) {
            sb.append("  ").append(lines[i]).append("\n");
        }
        buffer = sb.toString();
    }

    private static void formatMainText() {
        String[] lines = main_text.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append("  ").append(line).append("\n");
        }
        main_text = sb.toString();
    }

}
