package ExpressionEvaluater.parse;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Osvaldo on 3/16/2015.
 */
public class OperationPush {

        private static Map<String,PushBuilder> operationPushMap = new HashMap<>();
        static {
            operationPushMap.put("Constant", new PushBuilder() {
                @Override
                public void pushInStack(Stack<Token> operatorStack, Stack<Token> expressionStack, Token... tokens) {
                    expressionStack.push(tokens[0]);
                }
            });
            operationPushMap.put("Add", new PushBuilder() {
                @Override
                public void pushInStack(Stack<Token> operatorStack, Stack<Token> expressionStack, Token... tokens) {
                    operatorStack.push(tokens[0]);
                }
            });

        }

        public static void push(Stack<Object> operatorStack, Stack<Token> tokensStack,Token...tokens){
            // operationPushMap.get(tokens[0].getType()).pushInStack(,operatorStack, );
        }

          interface PushBuilder {
            public void pushInStack(Stack<Token> operatorStack, Stack<Token> tokensStack, Token... tokens);
        }

}
