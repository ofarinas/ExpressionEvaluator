package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;

public interface Parser {
    public Object parser(String expression);
}