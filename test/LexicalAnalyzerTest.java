import ExpressionEvaluater.parse.LexicalAnalyzer;
import ExpressionEvaluater.parse.Token;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LexicalAnalyzerTest {

    public void assertTokenArray (Token[] tokenArray1, Token[] tokenArray2) {
        for (int i = 0; i < tokenArray1.length ; i++) {
            assertEquals(tokenArray1[i].getValue(), tokenArray2[i].getValue());
            assertEquals(tokenArray1[i].getType(), tokenArray2[i].getType());
        }
    }

    @Test
    public void oneToken () {
        String expression= "1";
        Token[] tokenArray = new Token[] { new Token("1", "Constant")};
        assertTokenArray(tokenArray, LexicalAnalyzer.analyze(expression));
    }

    @Test
    public void fiveToken () {
        String expression= "( 1 + 3 )";
        Token[] tokenArray = new Token[] { new Token("(", "("), new Token("1", "Constant"), new Token("+", "Add"), new Token("3", "Constant"), new Token(")", ")")};
        assertTokenArray(tokenArray, LexicalAnalyzer.analyze(expression));
    }

    @Test
    public void mixExpressions () {
        String expression = "( 1 - 2 ) * 5";
        Token[] tokenArray =  new Token[] {new Token("(", "("),
                new Token("1", "Constant"),
                new Token("-", "Sub"),
                new Token("2", "Constant"),
                new Token(")", ")"),
                new Token("*", "Mul"),
                new Token("5", "Constant")};
        assertTokenArray(tokenArray, LexicalAnalyzer.analyze(expression));
    }

}
