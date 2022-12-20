import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import gen.*

public class Main {

    public static void main(String[] args) throws Exception {

//        try {

            //gets the file as a character stream
            //uncomment the file path as needed

            CharStream input = new ANTLRFileStream("/Users/sooryasrajan/AntlrCompilerDesign/src/InputFiles/stack");
//            CharStream input = new ANTLRFileStream("/Users/sooryasrajan/AntlrCompilerDesign/src/InputFiles/multiplication");
//            CharStream input = new ANTLRFileStream("/Users/sooryasrajan/AntlrCompilerDesign/src/InputFiles/odd_numbers");
//            CharStream input = new ANTLRFileStream("/Users/sooryasrajan/AntlrCompilerDesign/src/InputFiles/fibonacci");
//            CharStream input = new ANTLRFileStream("/Users/sooryasrajan/AntlrCompilerDesign/src/InputFiles/stack");

            //generates a lexer output for the input code
             lexer = new LexarLexer(input);

            //Gets tokens for the input file
            CommonTokenStream token = new CommonTokenStream(lexer);

//            RDPParserPL0 parserPL0 = new RDPParserPL0(lexer);
//            parserPL0.start();

            //The token stream is parsed with the respective grammars to check for errors
            LexarParser parser = new LexarParser(token);
            parser.start();

//           walk tree
//            ParseTreeWalker walker = new ParseTreeWalker();
//            walker.walk(new PL0Listener(), parser.start());

//        } catch (Exception e) {
            //In case of parse exceptions, an error is thrown and handled here
//            System.out.println(e.getLocalizedMessage());
//        }
    }
}