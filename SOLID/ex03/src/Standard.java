public class Standard implements ShippingStrategy{
    @Override
    public double calculate(double weightKg){
        return 50 + 5*weightKg; 
    }

}
