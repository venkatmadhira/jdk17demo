package streamsdemo1;

import java.util.Date;

public class AccountDetails {
   Date txnDate;
   Date valueDate;
   double amount;
   String description;
   String type;

   @Override
   public String toString() {
      return "AccountDetails{" +
              "txnDate=" + txnDate +
              ", valueDate=" + valueDate +
              ", amount=" + amount +
              ", description='" + description + '\'' +
              ", type='" + type + '\'' +
              '}';
   }
}
