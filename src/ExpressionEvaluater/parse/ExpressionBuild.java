package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.BinaryOperation;
import ExpressionEvaluater.operation.add.Add;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Osvaldo on 3/16/2015.
 */
public class ExpressionBuild {
    private static Map<String,OperationBuild> operationBuildMap = new HashMap<>();
    static {
        operationBuildMap.put("+", (operatorStack, expressionStack) -> {
            Constant constantRight = getRightOperation(expressionStack);
             return new Add(new Constant(expressionStack.pop().getValue()),constantRight);
        });


    }

    private static Constant getRightOperation(Stack<Token> expressionStack) {
        return new Constant(expressionStack.pop().getValue());
    }

    public static Operation build(Token token, Stack<Token> operatorStack, Stack<Token> expressionStack) {
        return getOperation(token, operatorStack, expressionStack);
    }

    private static BinaryOperation getOperation(Token token, Stack<Token> operatorStack, Stack<Token> tokenStack) {
        return operationBuildMap.get(token.getValue()).build(operatorStack,tokenStack);
    }

    private interface OperationBuild {
        public BinaryOperation build(Stack<Token> operatorStack,Stack<Token> tokensStack);
    }
}
