package streamsdemo1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Map<Account,Account> accountMap=accountService.getAccountSummary();
        Account account=new Account();
        account.accountNo="123456";
        Account fullAccount=accountMap.get(account);
        System.out.println(fullAccount.accountNo);
        Predicate<AccountDetails> predicate=(accountDetail)-> accountDetail.type.equals("C");
       List<AccountDetails> creditAccountDetail=
               fullAccount.accountDetails.stream().filter(accountDetails -> predicate.test(accountDetails)).collect(Collectors.toList());
        System.out.println("Stream Details---"+creditAccountDetail);

        List<AccountDetails> creditAccountDetailNormal=new ArrayList<>();
        for(int i=0;i<fullAccount.accountDetails.size();i++){
            if(fullAccount.accountDetails.get(i).type.equals("C")){
                creditAccountDetailNormal.add(fullAccount.accountDetails.get(i));
                System.out.println("Normal Loop Details---"+creditAccountDetailNormal);
            }
        }
        }
    }

