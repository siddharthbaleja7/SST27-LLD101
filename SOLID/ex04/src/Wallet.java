public class Wallet implements PaymentProvider{
    @Override
    public String pay(double amount){
        return "Wallet debit: " + amount;
    }
}
