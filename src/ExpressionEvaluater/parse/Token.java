package ExpressionEvaluater.parse;

public  class  Token {

    private Object value;
    private  String type;

    public Token(Object value, String type) {
        this.value = value;
        this.value=value;
        this.type=type;
    }

    public  String getType(){
        return type;
    }

    public Object getValue() {
        return value;
    }
}
