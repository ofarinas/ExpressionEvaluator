package ExpressionEvaluater.operation.add;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.BinaryExpression;

import java.lang.reflect.InvocationTargetException;


public class DoubleToDoubleAdd extends BinaryExpression {


    public DoubleToDoubleAdd(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }


    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftExpression().value()+(Double) getRightExpression().value();
    }

    @Override
    public String type() {
        return "DoubleToDoubleAdd";
    }

}
