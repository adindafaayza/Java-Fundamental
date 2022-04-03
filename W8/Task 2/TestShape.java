/**
 * Class untuk mengetes Class Shape, Circle, Rectangle, dan Square
 */

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());
        
        System.out.println("");
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("Area of Circle=" + c1.getArea());
        System.out.println("Perimeter of Circle=" + c1.getPerimeter());
        Circle c2 = new Circle(3);
        System.out.println(c2.toString());
        System.out.println("Area of Circle=" + c2.getArea());
        System.out.println("Perimeter of Circle=" + c2.getPerimeter());
        
        System.out.println("");
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area of Rectangle=" + r1.getArea());
        System.out.println("Perimeter of Rectangle=" + r1.getPerimeter());
        Rectangle r2 = new Rectangle(2, 4);
        System.out.println(r2.toString());
        System.out.println("Area of Rectangle=" + r2.getArea());
        System.out.println("Perimeter of Rectangle=" + r2.getPerimeter());
        
        System.out.println("");
        Square sq1 = new Square(5);
        sq1.setWidth(2);
        sq1.setLength(2);
        System.out.println(sq1.toString());
        System.out.println("Area of Square=" + sq1.getArea());
        System.out.println("Perimeter of Square=" + sq1.getPerimeter());
    }
    
}
