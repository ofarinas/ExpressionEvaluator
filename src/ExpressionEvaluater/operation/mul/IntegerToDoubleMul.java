package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class IntegerToDoubleMul extends ExpressionEvaluater.operation.Operation {

    public IntegerToDoubleMul(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftOperation().value() * (Double) getRightOperation().value();
    }

    @Override
    public String type() {
        return "IntegerToDoubleMul";
    }
}
