package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.BinaryExpression;


import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToDoubleSubtract extends BinaryExpression {


    public DoubleToDoubleSubtract(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftExpression().value() - (Double) getRightExpression().value();
    }

    @Override
    public String type() {
        return null;
    }
}
