package ExpressionEvaluater.operation.add;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;

import java.lang.reflect.InvocationTargetException;
/**
 * Created by osvaldo on 2/10/15.
 */
public class Add extends BinaryOperation {

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

    @Override
    public boolean equals(Object obj) {
        try {
            return isEqualLeftOperation((Add) obj) && isEqualRightOperation((Add) obj);
        } catch (ClassNotFoundException | InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isEqualRightOperation(Add obj) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return getRightOperation().value().equals( obj.getRightOperation().value());
    }

    private boolean isEqualLeftOperation(Add obj) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return getLeftOperation().value().equals( obj.getLeftOperation().value());
    }
}
