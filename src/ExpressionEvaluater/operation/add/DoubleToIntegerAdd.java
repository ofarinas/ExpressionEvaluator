package ExpressionEvaluater.operation.add;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToIntegerAdd extends Operation {

    public DoubleToIntegerAdd(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double)getLeftExpression().value() + (Integer) getRightExpression().value();
    }

    @Override
    public String type() {
        return "DoubleToIntegerAdd";
    }
}
