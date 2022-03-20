import java.util.*;

class Product {
    private String name;
    private List <Food> foods;
    
    Product (String name, List <Food> foods){
        this.name = name;
        this.foods = foods;
    }
    
    public List <Food> getFoods(){
        return foods;
    }
}
