import ExpressionEvaluater.operation.Operation;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.mul.Mul;
import ExpressionEvaluater.parse.SyntacticAnalyzer;
import ExpressionEvaluater.parse.Token;
import org.junit.Test;
import static junit.framework.Assert.*;

public class TestingSyntacticAnalyzer {

    @Test
    public void withThreeTokenAndParenthesis() throws Exception {
        Token[]list={new Token("(", "("), new Token(1,"Constant"), new Token("+","Add"), new Token(4,"Constant"), new Token(")",")")};
        Operation operation = (Operation) SyntacticAnalyzer.parse(list);
        assertTrue(operation instanceof Add);
        assertEquals(operation.getLeftOperation().value(),1);
        assertEquals(operation.getRightOperation().value(),4);
    }

    @Test
    public void withThreeTokenWithoutParenthesis() throws Exception {
        Token[]list={new Token(1,"Constant"), new Token("+","Add"), new Token(4,"Constant")};
        Operation operation = (Operation) SyntacticAnalyzer.parse(list);
        assertTrue(operation instanceof Add);
        assertEquals(operation.getLeftOperation().value(),1);
        assertEquals(operation.getRightOperation().value(),4);
    }

    @Test
    public void withThreeTokenWithParenthesisAndMul() throws Exception {
        Token[]list={new Token("(", "("), new Token(1,"Constant"), new Token("*","Mul"), new Token(4,"Constant"), new Token(")",")")};
        Operation operation = (Operation) SyntacticAnalyzer.parse(list);
        assertTrue(operation instanceof Mul);
        assertEquals(operation.getLeftOperation().value(),1);
        assertEquals(operation.getRightOperation().value(),4);
    }

    @Test
    public void withFiveTokensWithoutParenthesis() throws Exception {
        Token[]list={new Token(1,"Constant"), new Token("+","Add"), new Token(4,"Constant"), new Token("+","Add"), new Token(2,"Constant")};
        Operation operation = (Operation) SyntacticAnalyzer.parse(list);
        assertTrue(operation instanceof Add);
        Operation aux = (Operation) operation.getLeftOperation();
        assertTrue(aux instanceof Add); //Devolver la instancia de la izquierda
        assertEquals(((Operation) operation.getLeftOperation()).value(), 1);
        assertTrue(operation.getRightOperation() instanceof Add);
        assertEquals(((Operation) operation.getRightOperation()).getRightOperation().value(), 4);
        assertEquals(((Operation) operation.getRightOperation()).getLeftOperation().value(), 2);
        assertEquals(operation.getRightOperation().value(),2);
    }

}
