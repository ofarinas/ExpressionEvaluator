import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.parse.SyntacticAnalyzer;
import ExpressionEvaluater.parse.Token;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestingSyntacticAnalyzer {

    @Test
    public void withOnePlusTwo() throws Exception {
        Token[] tokens = {new Token(3, "Constant"), new Token("+", "Add"), new Token(2, "Constant")};
        assertEquals(new Add(new Constant(3), new Constant(2)), SyntacticAnalyzer.parse(tokens));
    }
}
