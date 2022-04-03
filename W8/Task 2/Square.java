/**
 * Class Circle yang merupakan subclass dari Rectangle
 * Tidak memiliki instance tapi diwarisi dari class Rectangle
 */

public class Square extends Rectangle{
    
    // Constructor
    public Square (double side) {
        super(side, side);
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    
    @Override
    public void setLength(double length){
        super.setLength(length);
    }
    
    @Override
    public double getArea(){
        return super.getArea();
    }
    
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
    
    @Override
    public String toString(){
        return "A Square with side=" + super.getWidth() + ", which is a"
                + " subclass of " + super.toString();
    }
}
