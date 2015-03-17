package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Constant;
import ExpressionEvaluater.expression.Expression;

import java.util.Stack;

public class SyntacticAnalyzer {


    public static Expression parse(Token... tokens) {
        Stack<Expression> tokenStack = new Stack<>();
        Stack<Token> operatorStack = new Stack<>();
        for (Token token : tokens) {

            fillStack(tokenStack, operatorStack, token);
        }
        return buildExpression(tokenStack, operatorStack);
    }

    private static void fillStack(Stack<Expression> tokenStack, Stack<Token> operatorStack, Token token) {
        if(token.getType().equals("Constant"))tokenStack.push(new Constant(token.getValue()));
        if(token.getType().equals("(")) operatorStack.push(token);
        if(token.getType().equals(")")) solvedBracket(tokenStack,operatorStack);
        if(token.getType().equals("Add")) operatorStack.push(token);
        if(token.getType().equals("Sub")) operatorStack.push(token);
        if(token.getType().equals("Mul")) operatorStack.push(token);
    }

    private static void solvedBracket(Stack<Expression> tokenStack, Stack<Token> operatorStack) {
        Token temp = operatorStack.peek();
        while (!temp.getValue().equals("(")) {
            ExpressionBuild.getOperation(operatorStack,tokenStack);
            temp= operatorStack.peek();
        }
        operatorStack.pop();
    }

    private static Expression buildExpression(Stack<Expression> expressionStack, Stack<Token> operatorStack) {
            while (!operatorStack.isEmpty()){
                  ExpressionBuild.getOperation(operatorStack,expressionStack);
            }
    return expressionStack.pop();
    }
}