package ExpressionEvaluater.expression;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by osvaldo on 2/10/15.
 */
public interface Operation {
    public  Object value() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
