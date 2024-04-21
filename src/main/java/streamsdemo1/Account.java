package streamsdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    String accountNo;
    double balance;
    String ifscCode;
    Address address;
    User user;
    List<AccountDetails> accountDetails=new ArrayList<>();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNo, account.accountNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

}
