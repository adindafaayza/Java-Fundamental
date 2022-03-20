import java.util.*;

class MainAggregation {

    public static void main(String[] args) {
        Food f1 = new Food("Pocky Chocolate", "Glico", "March 2022");
        Food f2 = new Food("Indomie Mi Goreng", "Indofood", "April 2022" );
        Food f3 = new Food("Magnum Double Chocolate", "Glico", "June 2023");
        
        List <Food> foods = new ArrayList <Food>();
        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        
        Product edible = new Product("Food", foods);
        
        List <Product> products = new ArrayList <Product>();
        products.add(edible);
        
        ConvenienceStore store = new ConvenienceStore("Alfamart", products);
        System.out.println("Total of food products in store: " + store.getTotalFoodProductsInStore());
        
    }
    
}
