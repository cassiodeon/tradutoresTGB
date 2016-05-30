import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class TranslatePortugol_Java {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        GrammarPortugolLexer lexer = new GrammarPortugolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarPortugolParser parser = new GrammarPortugolParser(tokens);
        ParseTree tree = parser.algoritmo(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        TranslateListener translate = new TranslateListener(parser);
        walker.walk(translate, tree); // initiate walk of tree with listener
    }
}