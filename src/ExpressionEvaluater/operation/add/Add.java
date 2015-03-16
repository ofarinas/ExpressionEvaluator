package ExpressionEvaluater.operation.add;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;
/**
 * Created by osvaldo on 2/10/15.
 */
public class Add extends ExpressionEvaluater.operation.Operation {

    public Add(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Add");
    }

    @Override
    public String type() {
        return "Add";
    }
}
