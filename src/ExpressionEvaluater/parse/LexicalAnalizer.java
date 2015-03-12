package ExpressionEvaluater.parse;import ExpressionEvaluater.expression.Expression;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by osvaldo on 2/28/15.
 */
public class LexicalAnalizer {
    public static ArrayList<Expression> analizer(String expression) {
        StringTokenizer stringTokenizer = new StringTokenizer(expression, " ");
        ArrayList<Expression> expressionToke = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            expressionToke.add(ExpressionBuild.build(stringTokenizer.nextToken()));
        }
        return expressionToke;
    }
}
