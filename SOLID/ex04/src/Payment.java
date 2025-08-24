public class Payment {
    PaymentProvider paymentProvider;
    double amount;
    Payment(PaymentProvider paymentProvider, double a){ 
        this.paymentProvider=paymentProvider; 
        this.amount=a; 
    }
}