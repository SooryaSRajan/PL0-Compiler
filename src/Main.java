import PL0Modules.PL0Lexer;
import PL0Modules.PL0Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

    public static void main(String[] args) throws Exception {

        CharStream codePointCharStream = CharStreams.fromFileName("src/InputFiles/stack");

//        CharStream input = new ANTLRFileStream("/InputFiles/stack");

        //generates a lexer output for the input code
        PL0Lexer lexer = new PL0Lexer(codePointCharStream);

        //Gets tokens for the input file
        CommonTokenStream token = new CommonTokenStream(lexer);

        //The token stream is parsed with the respective grammars to check for errors
        PL0Parser parser = new PL0Parser(token);
        parser.program();

//           walk tree
        ParseTreeWalker walker = new ParseTreeWalker();
//      walker.walk(new PL0Listener(), parser.start());


    }
}