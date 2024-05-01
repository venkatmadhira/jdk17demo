package swiggy;
public class CheckedException extends Exception {
    public final int code;

    public CheckedException(int code, String message) {
        super(message);
        this.code = code;
    }
}

