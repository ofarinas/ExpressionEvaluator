package ExpressionEvaluater.parse;

import java.util.HashMap;
import java.util.Map;

public class TokedBuild {

    static Map<String,Token>tokenMap = new HashMap<String, Token>() {
        {
            put("+", new Token("+", "Add"));
            put("-", new Token("-", "Sub"));
            put("*", new Token("*", "Mul"));
            put("/", new Token("/", "Div"));
            put("(",new Token("(","("));
            put(")",new Token(")",")"));
        }
    };

    public static Token getToken(String character) {
        if (character.matches("[0-9]+")) return new Token(character, "Constant");
        return tokenMap.get(character);
    }
}
