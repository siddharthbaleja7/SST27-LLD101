public class Demo03 {
    public static void main(String[] args) {
        Shipment s = new Shipment(new Overnight(),5.5);
        System.out.println(new ShippingCostCalculator().cost(s));
    }

}
