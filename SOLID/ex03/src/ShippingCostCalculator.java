public class ShippingCostCalculator {
    double cost(Shipment s){
       return s.shippingStrategy.calculate(s.weightKg);
    }
}
