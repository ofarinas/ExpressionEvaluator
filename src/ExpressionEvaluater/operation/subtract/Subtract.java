package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/10/15.
 */
public  class Subtract extends BinaryOperation {

    public Subtract(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Subtract");
    }

    @Override
    public String type() {
        return "Subtract";
    }
}
