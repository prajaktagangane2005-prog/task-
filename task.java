
public class Payment {
    public static void main(String[] args) {

        double balance = 5000;
        int amount = -3000;

        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Payment Success");
        }
    }
}
