package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(6);
        Measurable yourShape = new Rectangle(5, 10);

//        myShape = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

//        myShape = new Square(5);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());
    }
}

