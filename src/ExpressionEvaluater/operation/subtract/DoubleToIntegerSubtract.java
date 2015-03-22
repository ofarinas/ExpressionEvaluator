package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Expression;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToIntegerSubtract {
    private Expression expression1;
    private Expression expression2;

    public DoubleToIntegerSubtract(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) expression1.value() - (Integer) expression2.value();
    }
}
