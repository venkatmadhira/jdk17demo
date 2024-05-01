package newswiggy;

public enum ErrorCode {

    ERROR_CODE_101("LOGIN FAILED DUE TO INVALID CREDENTIALS","101"),
    ERROR_CODE_102("DISH NOT FOUND","102"),
    ERROR_CODE_103("RESTAURANT NOT FOUND","103");
    String message;
    String code;

    ErrorCode(String message, String code) {
        this.message = message;
        this.code = code;
    }
}
