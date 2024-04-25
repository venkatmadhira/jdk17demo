package swiggyapplatest;

public class LoginService {
    public String mobileNo = "1234567890";
    public int otp = 1234;

    public boolean validateLogin(String mobileNumber, int otp) {
        return mobileNo.equals(mobileNumber) && this.otp == otp;
    }
}




