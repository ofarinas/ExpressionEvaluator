package ExpressionEvaluater.operation.add;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.BinaryExpression;

import java.lang.reflect.InvocationTargetException;
/**
 * Created by osvaldo on 2/10/15.
 */
public class Add extends BinaryExpression {

    public Add(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value("Add");
    }

    @Override
    public String type() {
        return "Add";
    }

}
