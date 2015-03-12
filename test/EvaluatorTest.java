import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.evaluador.Evaluator;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.mul.Mul;
import ExpressionEvaluater.operation.subtract.Subtract;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;//

public class EvaluatorTest {
    @Test
    public void oneNumber() throws Exception {
        Expression expression = expression(new Constant(1));
        Evaluator evaluator = new Evaluator();
        assertEquals(1, evaluator.evaluate(expression));
    }

    private Expression expression(Expression expressions) {
        return expressions;
    }

    @Test
    public void sumTwoIntegerNumber() throws Exception {
        Expression expression = expression(new Add(new Constant(1), new Constant(2)));
        Evaluator evaluator = new Evaluator();
        assertEquals(3, evaluator.evaluate(expression));
    }

    @Test
    public void sumDoubleAndIntegerNumber() throws Exception {
        Expression expression = expression(new Add(new Constant(1.5), new Constant(2)));
        Evaluator evaluator = new Evaluator();
        assertEquals(3.5, evaluator.evaluate(expression));
    }

    @Test
    public void restTwoNumber() throws Exception {
        Expression expression = expression(new Subtract(new Constant(4), new Constant(2)));
        assertEquals(2, Evaluator.evaluate(expression));
    }

    @Test
    public void sumOneNumberToRestTwoNumber() throws Exception {
        Expression expression = expression(new Add(new Constant(4), expression(new Subtract(new Constant(4), new Constant(2)))));
        assertEquals(6, (Integer) Evaluator.evaluate(expression), 0.0001);
    }
    @Test
      public void mulOneNumberToRestTwoNumber() throws Exception {
        Expression expression = expression(new Mul(new Constant(4), expression(new Subtract(new Constant(4), new Constant(2)))));
        assertEquals(8, (Integer) Evaluator.evaluate(expression), 0.0001);
    }

}
