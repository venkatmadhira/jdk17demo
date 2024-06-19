package bank.service;

import bank.model.User;

public class LoginService {
    static int maxLoginAttempts=3;
    public String login(User inputUser){
        String bankUsername="abc";
        String bankPassword="123";
        if(!inputUser.locked) {
            if (inputUser.userName.equals(bankUsername) && inputUser.password.equals(bankPassword)) {
                return "Login Successful";
            } else {
                inputUser.noOfAttempts = inputUser.noOfAttempts + 1;
                if (inputUser.noOfAttempts >= maxLoginAttempts) {
                    inputUser.locked = true;
                }
                    return "Invalid Login Details left with " + (maxLoginAttempts - inputUser.noOfAttempts) + "  attempts";
                }
            }else {
            return "Your Account Is Locked";
        }
    }
}
