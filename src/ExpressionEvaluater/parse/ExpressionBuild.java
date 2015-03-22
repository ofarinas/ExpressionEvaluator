package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Expression;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.mul.Mul;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Osvaldo on 3/16/2015.
 */
public class ExpressionBuild {
    private static Map<String, OperationBuild> operationBuildMap = new HashMap<>();

    static {
        operationBuildMap.put("+", (operatorStack, expressionStack) -> {
            Expression expressionRight = expressionStack.pop();
            Expression expressionLeft = expressionStack.pop();
            Add add = new Add(expressionLeft, expressionRight);
            expressionStack.push(add);
        });
        operationBuildMap.put("*", (operatorStack, expressionStack) -> {
            Expression expressionRight = expressionStack.pop();
            Expression expressionLeft = expressionStack.pop();
            Mul mul = new Mul(expressionLeft, expressionRight);
            expressionStack.push(mul);
        });
    }

    public static void getOperation( Stack<Token> operatorStack, Stack<Expression> tokenStack) {
        operationBuildMap.get(getToken(operatorStack)).build(operatorStack, tokenStack);
        }

    private static Object getToken(Stack<Token> operatorStack) {
        return  operatorStack.pop().getValue();
    }

    private interface OperationBuild {
        public void build(Stack<Token> operatorStack, Stack<Expression> tokensStack);
    }
}
