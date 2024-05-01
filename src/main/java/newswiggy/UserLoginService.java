package newswiggy;

public class UserLoginService {

    String userName="abc@gmail.com";
    String password="123456";


    public boolean loginValidate( String localUserName,String localPassword) throws CustomCheckedException {

        if(localUserName.equals(userName)&&localPassword.equals(password)){
            System.out.println("login successful");
            return true;
        }
        else {
           throw new CustomCheckedException(ErrorCode.ERROR_CODE_101.code, ErrorCode.ERROR_CODE_101.message);
        }
    }

}
