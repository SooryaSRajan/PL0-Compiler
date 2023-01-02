import CGenerator.CGenerator;
import PL0Modules.PL0Lexer;
import PL0Modules.PL0Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

    public static void main(String[] args) throws Exception {

        CharStream codePointCharStream = CharStreams.fromFileName("src/InputFiles/stack.pl0");

        //generates a lexer output for the input code
        PL0Lexer lexer = new PL0Lexer(codePointCharStream);

        //Gets tokens for the input file
        CommonTokenStream token = new CommonTokenStream(lexer);

        //The token stream is parsed with the respective grammars to check for errors
        PL0Parser parser = new PL0Parser(token);
//        parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(new CGenerator(), parser.program());

        //TODO: Use tree walker to walk through code, generate IR directly by maintaining HashMaps of global and local variables, evaluate expressions as much as I can maybe? Use Stack to decompose into 3-address code


    }
}