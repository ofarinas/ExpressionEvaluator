package ExpressionEvaluater.operation.add;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToIntegerAdd extends BinaryOperation {

    public DoubleToIntegerAdd(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftOperation().value() + (Integer) getRightOperation().value();
    }

    @Override
    public String type() {
        return "DoubleToIntegerAdd";
    }
}
