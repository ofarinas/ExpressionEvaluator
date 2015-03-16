package ExpressionEvaluater.operation.add;
import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;


public class DoubleToDoubleAdd extends BinaryOperation {


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
