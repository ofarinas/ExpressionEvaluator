package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.Operation;

import java.lang.reflect.InvocationTargetException;

public class IntegerToIntegerMul extends Operation {


    public IntegerToIntegerMul(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftExpression().value() * (Integer) getRightExpression().value();
    }

    @Override
    public String type() {
        return "IntegerToIntegerMul";
    }

}
