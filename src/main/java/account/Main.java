package account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100.0);
        Service service = new Service();
        service.displayBalance(account);
        service.deposit(account, 200.0);
        service.withdraw(account, 200.0);
    }
}

