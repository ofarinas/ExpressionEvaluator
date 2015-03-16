package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;

public class IntegerToIntegerMul extends BinaryOperation {


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
