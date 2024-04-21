package streamsdemo1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Test {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Map<Account, Account> accountMap = accountService.getAccountSummary();
        Account account = new Account();
        account.accountNo = "123456";
        Account fullAccount = accountMap.get(account);
        System.out.println(fullAccount.accountNo);
        Predicate<AccountDetails> predicate = (accountDetail) -> accountDetail.type.equals("C");
        List<AccountDetails> creditAccountDetail =
                fullAccount.accountDetails.stream().filter(accountDetails -> predicate.test(accountDetails)).collect(Collectors.toList());
        System.out.println("Stream Details---" + creditAccountDetail);

        List<AccountDetails> creditAccountDetailNormal = new ArrayList<>();
        for (int i = 0; i < fullAccount.accountDetails.size(); i++) {
            if (fullAccount.accountDetails.get(i).type.equals("C")) {
                creditAccountDetailNormal.add(fullAccount.accountDetails.get(i));
                System.out.println("Normal Loop Details---" + creditAccountDetailNormal);
            }
        }
        Map<String, Double> groupByTypeSum = fullAccount.accountDetails.stream().collect(groupingBy(AccountDetails::getType,
                summingDouble(AccountDetails::getAmount)));
        System.out.println(groupByTypeSum);

        Map<String, Double> groupByNormalLoop = new HashMap<>();
        double creditSum = 0;
        double debitSum = 0;

        for (int i = 0; i < fullAccount.accountDetails.size(); i++) {
            if (fullAccount.accountDetails.get(i).type.equals("C")) {
                AccountDetails details = fullAccount.accountDetails.get(i);
                creditSum = creditSum + details.getAmount();
                groupByNormalLoop.put("Credit",creditSum);
            } else if (fullAccount.accountDetails.get(i).type.equals("D")) {
                AccountDetails details = fullAccount.accountDetails.get(i);
                debitSum = debitSum + details.getAmount();
                groupByNormalLoop.put("Debit",debitSum);
            }
        }
        System.out.println(groupByNormalLoop);
    }
}



