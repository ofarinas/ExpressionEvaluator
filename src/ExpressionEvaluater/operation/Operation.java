package ExpressionEvaluater.operation;
import ExpressionEvaluater.expression.Evaluable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Operation implements ExpressionEvaluater.expression.Operation, Evaluable {
    private final ExpressionEvaluater.expression.Operation leftOperation;
    private final ExpressionEvaluater.expression.Operation rightOperation;

    public Operation(ExpressionEvaluater.expression.Operation leftOperation, ExpressionEvaluater.expression.Operation rightOperation) {
        this.leftOperation = leftOperation;
        this.rightOperation = rightOperation;
    }

    public Object value(String operation) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String classAdd = "ExpressionEvaluater.operation."+operation.toLowerCase() +"."+ type(leftOperation) + "To" + type(rightOperation) + operation;
        Class<?> operator = ClassLoader.getSystemClassLoader().loadClass(classAdd);
        Constructor<?> operationConstructor = operator.getConstructor(ExpressionEvaluater.expression.Operation.class, ExpressionEvaluater.expression.Operation.class);
        ExpressionEvaluater.expression.Operation operatorInstance = (ExpressionEvaluater.expression.Operation) operationConstructor.newInstance(leftOperation, rightOperation);
        return operatorInstance.value();
    }

    private String type(ExpressionEvaluater.expression.Operation operation) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       return operation.value().getClass().getSimpleName();
    }

    public ExpressionEvaluater.expression.Operation getLeftOperation() {
        return leftOperation;
    }

    public ExpressionEvaluater.expression.Operation getRightOperation() {
        return rightOperation;
    }

}
