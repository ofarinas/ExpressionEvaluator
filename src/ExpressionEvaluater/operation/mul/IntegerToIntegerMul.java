package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

public class IntegerToIntegerMul extends ExpressionEvaluater.operation.Operation {


    public IntegerToIntegerMul(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftOperation().value() * (Integer) getRightOperation().value();
    }

    @Override
    public String type() {
        return "IntegerToIntegerMul";
    }

}
