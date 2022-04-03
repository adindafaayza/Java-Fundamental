/**
 * Class Circle yang merupakan subclass dari Shape
 * Mempunyai instance radius
 */

public class Circle extends Shape {
    
    private double radius;
    
    // Getter Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Constructor
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }
}
