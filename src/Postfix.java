import lexer.Lexer;
import lexer.Token;

public class Postfix {
    public static void main(String [] args) throws Exception {
        //Parser parser = new Parser();
        //parser.expr();
        Lexer lexer = new Lexer();
        Token token;
        do {
            token = lexer.scan();
        }while (token == null);

    }
}
