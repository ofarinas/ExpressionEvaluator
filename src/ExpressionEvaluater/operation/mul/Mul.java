package ExpressionEvaluater.operation.mul;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/10/15.
 */
public class Mul extends ExpressionEvaluater.operation.Operation {

    public Mul(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Mul");
    }

    @Override
    public String type() {
        return "Mul";
    }
}
