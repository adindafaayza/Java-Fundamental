import java.util.*;

public class ConvenienceStore {
    private String storeName;
    private List <Product> products;
    
    ConvenienceStore(String storeName, List <Product> products){
        this.storeName = storeName;
        this.products = products;
    }
    
    public int getTotalFoodProductsInStore(){
        int noOfFoodProducts = 0;
        List <Food> foods;
        for(Product prod : products){
            foods = prod.getFoods();
            for (Food f : foods){
                noOfFoodProducts++;
            }
        }
        return noOfFoodProducts++;
    }
}
