package org.example.Card;

public class LoginProcess extends Login {
    public boolean login(String userName,String password){
       if(username.equals(userName) & passWord.equals(password)){
           System.out.println("Login Sucessful");
       }else {
           System.out.println("Login Failed");
       }
       return true;
    }
}
