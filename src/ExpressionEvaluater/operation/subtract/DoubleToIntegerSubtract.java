package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToIntegerSubtract {
    private Operation operation1;
    private Operation operation2;

    public DoubleToIntegerSubtract(Operation operation1, Operation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) operation1.value() - (Integer) operation2.value();
    }
}
