package ExpressionEvaluater;

import ExpressionEvaluater.expression.Expression;
import java.lang.ClassNotFoundException;
import java.lang.InstantiationException;
import java.lang.NoSuchMethodException;
import java.lang.Object;
import java.lang.reflect.InvocationTargetException;

public class Evaluator {

    public static Object evaluate(Expression expression) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, java.lang.IllegalAccessException {
        return expression.value();
    }
}
