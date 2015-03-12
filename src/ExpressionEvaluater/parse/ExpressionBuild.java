package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionBuild {
    private static Map<String, ExpressionCaster> expressionMap = new HashMap<>();

    static {
        expressionMap.put("Integer", value -> new Constant(1));
    }

    public static Expression build(String s) {
        return null;
    }

    interface ExpressionCaster {
        public Expression caster(String expression);
    }
}
