package ExpressionEvaluater.operation.add;
import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class IntegerToIntegerAdd extends ExpressionEvaluater.operation.Operation {

    public IntegerToIntegerAdd(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftOperation().value() + (Integer) getRightOperation().value();
    }

    @Override
    public String type() {
        return "IntegerToIntegerAdd";
    }
}
