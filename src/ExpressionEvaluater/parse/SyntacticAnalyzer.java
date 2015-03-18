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
        if (token.getType().equals("Constant")) tokenStack.push(new Constant(token.getValue()));
        else if (token.getType().equals("(")) operatorStack.push(token);
        else if (token.getType().equals(")")) solvedBracket(tokenStack, operatorStack);
        else if (token.getType().equals("Add")) {
            if (hashLessPrecedence("Add", operatorStack))
                ExpressionBuild.getOperation(operatorStack, tokenStack);
            operatorStack.push(token);
        } else if (token.getType().equals("Sub")) operatorStack.push(token);
        else if (token.getType().equals("Mul")) operatorStack.push(token);
    }

    private static boolean hashLessPrecedence(String operator, Stack<Token> operatorStack) {
        if(operatorStack.isEmpty() ||  isOperator(operator)) return false;
        return precedence(operatorStack.peek().getType()) > precedence(operator);
    }

    private static boolean isOperator(String operator) {
        for (int i = 0; i < Precedence.values().length; i++) {
            if(Precedence.values()[i].name().equals(operator))return false ;
        }
        return true;
    }

    private static int precedence(String operator) {
        return Precedence.valueOf(operator.toUpperCase()).ordinal();
    }

    enum Precedence {
        ADD(1), MUL(2);
        private int value;

        Precedence(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private static void solvedBracket(Stack<Expression> tokenStack, Stack<Token> operatorStack) {
        Token temp = operatorStack.peek();
        while (!temp.getValue().equals("(")) {
            temp = pushExpression(tokenStack, operatorStack);
        }
        operatorStack.pop();
    }

    private static Token pushExpression(Stack<Expression> tokenStack, Stack<Token> operatorStack) {
        ExpressionBuild.getOperation(operatorStack, tokenStack);
        return operatorStack.peek();
    }

    private static Expression buildExpression(Stack<Expression> expressionStack, Stack<Token> operatorStack) {
        while (!operatorStack.isEmpty()) {
            ExpressionBuild.getOperation(operatorStack, expressionStack);
        }
        return expressionStack.pop();
    }
}