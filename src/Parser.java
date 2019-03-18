import java.io.IOException;

public class Parser {
    static int lookahead;
    public Parser() throws IOException {
        lookahead = System.in.read();
    }
    void expr () throws Exception {
        term() ;
        while (true) {
            if (lookahead == '+') {
                match('+');
                term();
                System.out.write('+');
            }else if (lookahead == '-') {
                match('-');
                term();
                System .out.write('-');
            }else
                return;
        }
    }

    void term () throws Exception {
        if (Character.isDigit((char)lookahead) ) {
            System.out.write((char)lookahead);
            match(lookahead);
        }else
            throw new Exception("Synatx error");
    }

    void match(int t) throws Exception {
        if (lookahead == t)
            lookahead = System.in.read();
        else
            throw new Exception("Syntax error");
    }
}
