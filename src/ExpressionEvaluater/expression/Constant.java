package ExpressionEvaluater.expression;

public  class Constant implements Expression {
    private final Object constant;

    public Constant(Object  constant) {
        this.constant = constant;
    }

    @Override
    public Object  value() {
         return constant;
    }

}
