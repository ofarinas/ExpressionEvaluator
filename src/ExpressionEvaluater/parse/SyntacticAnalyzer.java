package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Operation;

import java.util.Arrays;
import java.util.Stack;

public class SyntacticAnalyzer {


    public static Operation parse(Token... tokens) {
        Stack<Token> tokenStack = new Stack<>();
        Stack<Token> operatorStack = new Stack<>();
        return chutingYarInDeep(tokenStack, operatorStack, tokens);
    }

    private static Operation chutingYarInDeep(Stack<Token> expressionStack, Stack<Token> operatorStack, Token[] tokens) {
        if (tokens.length == 0) {
            Operation build = ExpressionBuild.build(operatorStack.pop(), operatorStack, expressionStack);
            return build;
        }
        if (tokens[0].getType().equals("Constant")) {
            expressionStack.push(tokens[0]);
            return chutingYarInDeep(expressionStack,operatorStack, Arrays.copyOfRange(tokens, 1, tokens.length ));
        }
        else if (tokens[0].getType().equals("Add")) {
            operatorStack.push(tokens[0]);
            return chutingYarInDeep(expressionStack,operatorStack, Arrays.copyOfRange(tokens, 1, tokens.length ));
        }
        return null;
    }
}