package ExpressionEvaluater.parse;

public class Token {

    public String value, type;

    public Token(String value, String type) {
        this.value=value;
        this.type=type;
    }

    public  String getType(){
        return type;
    }

    public String getValue() {
        return value;
    }
}

