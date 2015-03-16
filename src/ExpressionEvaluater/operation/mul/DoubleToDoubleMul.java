package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToDoubleMul extends BinaryOperation {

    public DoubleToDoubleMul(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftOperation().value() * (Double) getRightOperation().value();
    }

    @Override
    public String type() {
        return "DoubleToDoubleMul";
    }
}