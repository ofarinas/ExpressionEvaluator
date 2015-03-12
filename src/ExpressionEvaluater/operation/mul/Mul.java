package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/10/15.
 */
public class Mul extends Operation {

    public Mul(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Mul");
    }

    @Override
    public String type() {
        return "Mul";
    }
}
