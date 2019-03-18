package lexer;

public class Rel extends Token  {
    public final String lexeme;
    public Rel(String s) {
        super(Tag.Rel);
        lexeme = new String (s);
    }
}
