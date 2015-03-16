package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class IntegerToDoubleSubtract extends ExpressionEvaluater.operation.Operation {


    public IntegerToDoubleSubtract(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftOperation().value() - (Double) getRightOperation().value();
    }

    @Override
    public String type() {
        return "IntegerToDoubleSubstract";
    }
}
