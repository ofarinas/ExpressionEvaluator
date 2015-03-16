package ExpressionEvaluater.evaluador;

import ExpressionEvaluater.expression.Operation;
import java.lang.ClassNotFoundException;
import java.lang.InstantiationException;
import java.lang.NoSuchMethodException;
import java.lang.Object;
import java.lang.reflect.InvocationTargetException;

public class Evaluator {

    public static Object evaluate(Operation operation) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, java.lang.IllegalAccessException {
        return operation.value();
    }
}
