package CGenerator;


class Value {
    String content;
    VarType type;

    //only if array
    VarType typeOfArray;

    enum VarType {INT, FLOAT, ARRAY, VOID}

    Value(String content, VarType type, boolean isArray) {
        this.content = content;
        if(isArray) {
            this.type = VarType.ARRAY;
            this.typeOfArray = type;
        } else {
            this.type = type;
        }
    }
}