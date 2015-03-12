import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.parse.Token;
import org.junit.Test;

import static junit.framework.Assert.*;

public class SintacticalAnalyzerTest {
    @Test
    public void whithOneToken() throws Exception {
        Token[]TokenList= {new Token(new Constant(1))};
        assertEquals(TokenList[0],new Constant(1));
    }

}
