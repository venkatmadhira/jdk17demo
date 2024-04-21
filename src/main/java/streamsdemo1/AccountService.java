package streamsdemo1;
import java.util.*;

public class AccountService {

    public Map<Account, Account> getAccountSummary() {

        Address userAddress = new Address();
        userAddress.doorNo = "123";
        userAddress.street = "kphb";
        userAddress.state = "tg";
        userAddress.pinCode = "500080";

        Address bankAddress = new Address();
        bankAddress.doorNo = "456";
        bankAddress.street = "jntu";
        bankAddress.state = "tg";
        bankAddress.pinCode = "500085";

        User user = new User();
        user.address = userAddress;
        user.name = "venkat";

        AccountDetails accountDetailsCredit = new AccountDetails();
        accountDetailsCredit.amount = 1000;
        accountDetailsCredit.description = "credit";
        accountDetailsCredit.txnDate = new Date();
        accountDetailsCredit.valueDate = new Date();
        accountDetailsCredit.type="C";

        AccountDetails accountDetailsDebit = new AccountDetails();
        accountDetailsDebit.amount = 750;
        accountDetailsDebit.description = "debit";
        accountDetailsDebit.txnDate = new Date();
        accountDetailsDebit.valueDate = new Date();
        accountDetailsDebit.type="D";

        Account account = new Account();
        account.accountDetails.add(accountDetailsCredit);
        account.accountDetails.add(accountDetailsDebit);
        account.accountNo = "123456";
        account.address = bankAddress;
        account.ifscCode = "SBI1234";
        account.user = user;
        account.balance = 1000 - 750;

        Map<Account, Account> accountSummary = new HashMap<>();
        accountSummary.put(account, account);

        return accountSummary;
    }
}
