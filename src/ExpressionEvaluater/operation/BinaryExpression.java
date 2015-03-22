package ExpressionEvaluater.operation;
import ExpressionEvaluater.expression.Evaluable;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.add.Add;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class BinaryExpression implements Expression, Evaluable {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public BinaryExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Object value(String operation) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String classAdd = "ExpressionEvaluater.operation."+operation.toLowerCase() +"."+ type(leftExpression) + "To" + type(rightExpression) + operation;
        Class<?> operator = ClassLoader.getSystemClassLoader().loadClass(classAdd);
        Constructor<?> operationConstructor = operator.getConstructor(Expression.class, Expression.class);
        Expression operatorInstance = (Expression) operationConstructor.newInstance(leftExpression, rightExpression);
        return operatorInstance.value();
    }

    private String type(Expression expression) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       return expression.value().getClass().getSimpleName();
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            return isEqualLeftOperation((BinaryExpression) obj) && isEqualRightOperation((BinaryExpression) obj);
        } catch (ClassNotFoundException | InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isEqualRightOperation(BinaryExpression obj) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return getRightExpression().equals( obj.getRightExpression());
    }

    private boolean isEqualLeftOperation(BinaryExpression obj) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return getLeftExpression().value().equals( obj.getLeftExpression().value());
    }
}
