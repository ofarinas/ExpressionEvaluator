import ExpressionEvaluater.Interpreter;
import ExpressionEvaluater.evaluador.Evaluator;
import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.subtract.Subtract;
import ExpressionEvaluater.parse.Parser;
import org.junit.Test;

import static junit.framework.Assert.*;

public class InterpreterTest {

    @Test
    public void integration_test_with_add_two_number() throws Exception {
        String expression = "4 + 2";
        assertEquals(Interpreter.parser(expression), 6);
    }
    @Test
    public void integration_test_with_add_tree_number() throws Exception {
        String expression = "4 + 2 + 3";
        assertEquals(Interpreter.parser(expression), 9);
    }
    @Test
    public void integration_test_with_Mul_tree_number() throws Exception {
        String expression = "4 * 2 * 3";
        assertEquals(Interpreter.parser(expression), 24);
    }
    @Test
    public void integration_test_with_bracket_tree_number() throws Exception {
        String expression = "( 4.2 + 2 ) * 3";
        assertEquals(Interpreter.parser(expression), 18.6);
    }
}
