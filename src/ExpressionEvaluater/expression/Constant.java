package ExpressionEvaluater.expression;

public  class Constant implements Operation {
    private final Object constant;

    public Constant(Object  constant) {
        this.constant = constant;
    }

    @Override
    public Object  value() {
         return constant;
    }

    @Override
    public boolean equals(Object obj) {
        return constant.equals(((Constant)obj).value());

    }
}
