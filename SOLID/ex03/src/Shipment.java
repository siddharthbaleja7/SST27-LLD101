public class Shipment {
    ShippingStrategy shippingStrategy;
    double weightKg;
    Shipment(ShippingStrategy shippingStrategy, double weightKg) {
        this.shippingStrategy = shippingStrategy;
        this.weightKg = weightKg;
    }
}