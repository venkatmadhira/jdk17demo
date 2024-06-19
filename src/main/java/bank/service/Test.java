package bank.service;

import bank.model.User;

public class Test {
    public static void main(String[] args) {


        User user = new User();
        user.userName="aaa";
        user.password="aaa";
        LoginService loginService=new LoginService();
        String data1=loginService.login(user);
        String data2=loginService.login(user);
        String data3=loginService.login(user);
        String data4=loginService.login(user);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

    }
}
