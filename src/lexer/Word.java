package lexer;

public class Word extends Token{
    public final String lexeme;
    public Word(int t, String str) {
        super(t);
        lexeme = new String (str);
    }
}
