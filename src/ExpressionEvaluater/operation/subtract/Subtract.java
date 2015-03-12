package ExpressionEvaluater.operation.subtract;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.*;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/10/15.
 */
public  class Subtract extends Operation {

    public Subtract(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Subtract");
    }

    @Override
    public String type() {
        return "Subtract";
    }
}
