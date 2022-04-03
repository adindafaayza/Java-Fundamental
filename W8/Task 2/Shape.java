/**
 * Class Shape yang memiliki instance color dan filled
 */

public class Shape {
    
    private String color;
    private boolean filled;
    
    // Getter Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    // Constructors
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String toString(){
        return "A shape with color " + color + " and filled = " + filled;
    }
}
