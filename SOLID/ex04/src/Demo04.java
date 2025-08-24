
public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment(new UPI(), 499);

        System.out.println(new PaymentService().pay(payment));
    }
}
