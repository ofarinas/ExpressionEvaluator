package ExpressionEvaluater.parse;

import java.util.ArrayList;

public class LexicalAnalyzer {

    public static Token [] analyze (String string) {
        ArrayList<Token> tokens = new ArrayList<Token>();
        for (String character : string.split(" "))
            tokens.add(TokedBuild.getToken(character));
        return tokens.toArray(new Token [tokens.size()]);
    }

    public static void main (String args []) {
        String prueba = "( ( 1 + 2 ) * 4 )";
        for (Token token : analyze(prueba))
            System.out.println(token.getValue());
    }

}
