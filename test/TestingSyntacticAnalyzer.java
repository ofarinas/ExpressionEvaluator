import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.mul.Mul;
import ExpressionEvaluater.parse.SyntacticAnalyzer;
import ExpressionEvaluater.parse.Token;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingSyntacticAnalyzer  {

    @Test
    public void withOnePlusTwo() throws Exception {
        Token[] tokens = {new Token(3, "Constant"), new Token("+", "Add"), new Token(2, "Constant")};
        assertEquals(new Add(new Constant(3), new Constant(2)), SyntacticAnalyzer.parse(tokens));
    }

    @Test
    public void withAddThreeConstant() throws Exception {
        Token[] tokens = {new Token(3, "Constant"), new Token("+", "Add"), new Token(2, "Constant"), new Token("+", "Add"), new Token(3, "Constant")};
        assertEquals(new Add(new Constant(3), new Add(new Constant(2), new Constant(3))), SyntacticAnalyzer.parse(tokens));
    }

    @Test
    public void withAddThreeConstantAndBracket() throws Exception {
        Token[] tokens = {new Token("(", "("),new Token(1, "Constant"), new Token("+", "Add"), new Token(2, "Constant"), new Token(")", ")"), new Token("+", "Add"), new Token(3, "Constant")};
        Expression parse = SyntacticAnalyzer.parse(tokens);
        assertEquals(new Add( new Add(new Constant(1), new Constant(2)),new Constant(3)), parse);
    }

    @Test
    public void withMulAndAdd() throws Exception {
        Token[] tokens = {new Token(3, "Constant"), new Token("*", "Mul"), new Token(2, "Constant"), new Token("+", "Add"), new Token(3, "Constant")};
        Expression parse = SyntacticAnalyzer.parse(tokens);
        assertEquals(new Add(new Mul(new Constant(3), new Constant(2)), new Constant(3)), parse);
    }

    @Test
    public void withMulAndAddAndAdd() throws Exception {
        Token[] tokens = {new Token(3, "Constant"), new Token("*", "Mul"), new Token(2, "Constant"), new Token("+", "Add"), new Token(3, "Constant")};
        Expression parse = SyntacticAnalyzer.parse(tokens);
        assertEquals(new Add(new Mul(new Constant(3), new Constant(2)), new Constant(3)), parse);
    }
}
