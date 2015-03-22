package ExpressionEvaluater.parse;

import java.awt.geom.Arc2D;
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
        if (Number.isInteger(character)) return new Token(Integer.valueOf(character), "Constant");
        else if (Number.isDouble(character)) return new Token(Double.valueOf(character), "Constant");
        return tokenMap.get(character);
    }
    public static class Number{
        public static boolean isInteger(String number){
            return number.matches("\\d+");
        }
        public static boolean isDouble(String number){
            return number.matches("^-?[0-9]+([,\\.][0-9]*)?$");
        }

    }
}
