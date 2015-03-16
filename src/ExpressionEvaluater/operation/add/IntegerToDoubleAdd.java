package ExpressionEvaluater.operation.add;
import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/24/15.
 */
public class IntegerToDoubleAdd extends ExpressionEvaluater.operation.Operation {

    public IntegerToDoubleAdd(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftOperation().value() + (Double) getRightOperation().value();
    }
    @Override
    public String type() {
        return "IntegerToDoubleAdd";
    }

}