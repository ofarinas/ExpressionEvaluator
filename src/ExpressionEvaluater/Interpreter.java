package ExpressionEvaluater;

import ExpressionEvaluater.evaluador.Evaluator;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.parse.LexicalAnalyzer;
import ExpressionEvaluater.parse.SyntacticAnalyzer;

import java.lang.reflect.InvocationTargetException;

public interface Interpreter {


    static Object parser(String expression) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return Evaluator.evaluate(SyntacticAnalyzer.parse(LexicalAnalyzer.analyze(expression)));
    }
}
