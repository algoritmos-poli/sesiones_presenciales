public class ShapeDemo {

    public static void main(String[] args) {
        
        // We create objects of different classes, but store them in variables
        // of the INTERFACE type. This is polymorphism.
        Shape myCircle = new Circle(10);    // radius = 10
        Shape mySquare = new Square(5);     // side = 5
        
        // We don't need to know what specific type of shape each one is.
        // We only know that, by contract, they have a calculateArea() method.
        
        System.out.println("--- Using the Shape Interface ---");
        
        printArea(myCircle);  // Calls the method from the Circle class
        printArea(mySquare); // Calls the method from the Square class
    }
    
    // This method is very flexible: it works with ANY object
    // that implements the Shape interface, regardless of its class!
    public static void printArea(Shape shape) {
        System.out.println("The area of the shape is: " + shape.calculateArea());
    }
}