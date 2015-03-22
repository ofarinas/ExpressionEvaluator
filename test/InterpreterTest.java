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
    public void mock_integration_test_with_One_Number() throws Exception {
        String expression = "1";
        Parser parser= expression1 -> new Constant(1);
        Object result = Evaluator.evaluate((Expression) parser.parser(expression));
        assertEquals(result, 1);
    }
    @Test
    public void mock_integration_test_with_add_two_number() throws Exception {
        String expression = "1";
        Parser parser= expression1 -> new Add(new Constant(1.5), new Constant(2));
        Object result = Evaluator.evaluate((Expression) parser.parser(expression));
        assertEquals(result, 3.5);
    }

    @Test
    public void mock_integration_test_with_add_and_subtract() throws Exception {
        String expression = "1";
        Parser parser= expression1 ->  new Add(new Constant(4), new Subtract(new Constant(4), new Constant(2)));
        Object result = Evaluator.evaluate((Expression) parser.parser(expression));
        assertEquals(result, 6);
    }
}
