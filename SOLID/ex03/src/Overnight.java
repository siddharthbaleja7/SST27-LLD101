public class Overnight implements ShippingStrategy{
    @Override
    public double calculate(double weightKg){
        return 120 + 10*weightKg;
    }
}
