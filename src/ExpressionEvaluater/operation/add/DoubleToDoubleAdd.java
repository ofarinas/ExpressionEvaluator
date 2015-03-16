package ExpressionEvaluater.operation.add;
import ExpressionEvaluater.expression.Operation;

import java.lang.reflect.InvocationTargetException;


public class DoubleToDoubleAdd extends ExpressionEvaluater.operation.Operation {


    public DoubleToDoubleAdd(Operation leftOperation, Operation rightOperation) {
        super(leftOperation, rightOperation);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftOperation().value()+(Double) getRightOperation().value();
    }

    @Override
    public String type() {
        return "DoubleToDoubleAdd";
    }

}
