public class Express implements ShippingStrategy{
    @Override
    public double calculate(double weightKg){
        return 80 + 8*weightKg;
    }

}
