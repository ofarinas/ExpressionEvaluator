package ExpressionEvaluater.parse;

import ExpressionEvaluater.expression.Operation;
import ExpressionEvaluater.operation.add.Add;
import ExpressionEvaluater.operation.mul.Mul;
import ExpressionEvaluater.operation.subtract.Subtract;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Osvaldo on 3/14/2015.
 */
public class OperationBuild {
    private static Map<String, OperatorCaster> stringOperatorCasterMap= new HashMap<String, OperatorCaster>(){{
        put("Add", new OperatorCaster() {
            @Override
            public void caster(Deque<String> operatorsStack, Deque<Operation> finallyStack) {
                operatorsStack.pop();
                Operation right = finallyStack.pop();
                Operation left = finallyStack.pop();
                finallyStack.push(new Add(left, right));
            }
        });
        put("Sub", new OperatorCaster() {
            @Override
            public void caster(Deque<String> operatorsStack, Deque<Operation> finallyStack) {
                operatorsStack.pop();
                Operation right = finallyStack.pop();
                Operation left = finallyStack.pop();
                finallyStack.push(new Subtract(left, right));
            }
        });
        put("Mul", new OperatorCaster() {
            @Override
            public void caster(Deque<String> operatorsStack, Deque<Operation> finallyStack) {
                operatorsStack.pop();
                Operation right = finallyStack.pop();
                Operation left = finallyStack.pop();
                finallyStack.push(new Mul(left, right));
            }
        });

    }};
 public static OperatorCaster get(String key){
     return stringOperatorCasterMap.get(key);
 }
}

interface OperatorCaster {
    public void caster(Deque<String> operatorsStack, Deque<Operation> finallyStack);
}