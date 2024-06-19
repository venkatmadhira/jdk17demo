package swiggylatest.service;

import swiggylatest.model.OTP;
import swiggylatest.model.Restaurant;
import swiggylatest.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPService {

    private User userinstance;
    private OTP otpinstance;

    public OTP generateOTP(User inputuser){
        userinstance = inputuser;
        OTP otp = new OTP();
        otp.otpNum = UUID.randomUUID().toString();
        otp.createTime = new Date();
        long currentTimeInMillis = otp.createTime.getTime();
        long endTimeInMillis = currentTimeInMillis + 900000;
        otp.endTime = new Date(endTimeInMillis);
        otpinstance = otp;
        return otp;
    }

    public String otpValidation(OTP inputotp, User inputUser) {
        if (inputotp.otpNum.equals(otpinstance.otpNum)
                && userinstance.mobileNo.equals(inputUser.mobileNo)) {
            return "OTP Validation is Successful";
        } else {
            return "Invalid OTP";
}
}

}
