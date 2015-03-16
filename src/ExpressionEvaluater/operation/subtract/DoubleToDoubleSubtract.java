package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Operation;


import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class DoubleToDoubleSubtract extends ExpressionEvaluater.operation.Operation {


    public DoubleToDoubleSubtract(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftOperation().value() - (Double) getRightOperation().value();
    }

    @Override
    public String type() {
        return null;
    }
}
