package swiggyapplatest;

public enum ExceptionHandling {

    LOGIN_FAILED("404","Login Failed Due To Invaild Credentials "),
    NO_DISH_FOUND("106","No Dish Is Found"),
    NO_RESTAURANT_FOUND("107","No Restaurant Is Found");

    String code;
    String message;

    ExceptionHandling(String number, String message) {
        this.code=number;
        this.message=message;
    }
}
