
public class PaymentService {
    String pay(Payment p){
       return p.paymentProvider.pay(p.amount);
    }
}