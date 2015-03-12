package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.Operation;

import java.lang.reflect.InvocationTargetException;

public class IntegerToIntegerSubtract extends Operation  {


    public IntegerToIntegerSubtract(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftExpression().value() - (Integer) getRightExpression().value();
    }

    @Override
    public String type() {
        return "IntegerToIntegerSubtract ";
    }
}
