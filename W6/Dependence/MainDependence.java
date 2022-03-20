public class MainDependence {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Restaurant resto = new Restaurant();
        
        customer.startOrdering(resto);
    }
}
