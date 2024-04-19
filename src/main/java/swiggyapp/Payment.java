package swiggyapp;

public class Payment {
        public double amount;
        public String paymentMethod;

        public Payment(double amount, String paymentMethod) {
            this.amount = amount;
            this.paymentMethod = paymentMethod;
        }

        @Override
        public String toString() {
            return "Payment of Rs:" + amount + " made using " + paymentMethod;
        }
}
