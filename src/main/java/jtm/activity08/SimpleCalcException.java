package jtm.activity08;

public class SimpleCalcException extends Exception {
    public SimpleCalcException(String s) {
        super(s);
    }

    public SimpleCalcException(String s, Throwable throwable) {
        super(s, throwable);
    }

}
