/**
 * Class Cylinder yang merupakan subclass dari Circle
 * Mempunyai instance height
 * getArea() di-Override dan menjadi luas permukaan Cylinder
 */

public class Cylinder extends Circle{
    private double height; // private variable
    
    //Constructor with default color, radius and height
    public Cylinder(){
        super(); // Call superclass no-arg constructor Circle(
        height = 1.0;
    }
    
    // Constructor with default radius, color but given height
    public Cylinder(double height){
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    
    //Constructor with default color, but given radius, height
    public Cylinder(double radius, double height){
        super(radius); // Call superclass constructor Circle(r);
        this.height = height;
    }
    
    // A public method for retrieving the height
    public double getHeight(){
        return height;
    }
    
    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume(){
        return super.getArea()*height;
    }
    
    public double getArea(){
        return (2*Math.PI*super.getRadius()*height)+(2*super.getArea());
    }
    
    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
