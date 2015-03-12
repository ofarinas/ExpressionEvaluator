package ExpressionEvaluater.expression;

import java.lang.*;import java.lang.ClassNotFoundException;import java.lang.InstantiationException;import java.lang.NoSuchMethodException;import java.lang.Object;import java.lang.String;import java.lang.reflect.InvocationTargetException;

public interface Evaluable {
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, java.lang.IllegalAccessException;
    public String type();
}
