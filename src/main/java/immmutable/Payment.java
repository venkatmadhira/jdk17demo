package immmutable;

public class Payment {
    private  double amount;
    private  String payer;
    private  String payee;
    private  String payerMobile;
    private  String payeeMobile;
    private  String payerAccount;
    private  String payeeAccount;


    public Payment(double amount,String payer, String payee,
                   String payerMobile, String payeeMobile,
                   String payerAccount, String payeeAccount) {
        this.amount = amount;
        this.payer = payer;
        this.payee = payee;
        this.payerMobile = payerMobile;
        this.payeeMobile = payeeMobile;
        this.payerAccount = payerAccount;
        this.payeeAccount = payeeAccount;
    }

    public Payment( String payer, String payee,double amount, String payerMobile, String payeeMobile) {
        this(amount, payer, payee, payerMobile, payeeMobile, null, null);
    }
    public Payment(double amount, String payer, String payee, String payerAccount, String payeeAccount) {
        this(amount, payer, payee, null, null, payerAccount, payeeAccount);
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayer() {
        return payer;
    }

    public String getPayee() {
        return payee;
    }

    public String getPayerMobile() {
        return payerMobile;
    }

    public String getPayeeMobile() {
        return payeeMobile;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", payer='" + payer + '\'' +
                ", payee='" + payee + '\'' +
                ", payerMobile='" + payerMobile + '\'' +
                ", payeeMobile='" + payeeMobile + '\'' +
                ", payerAccount='" + payerAccount + '\'' +
                ", payeeAccount='" + payeeAccount + '\'' +
                '}';
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    }


