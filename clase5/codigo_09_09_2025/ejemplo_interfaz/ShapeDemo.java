public class ShapeDemo {
  public static void main(String[] args) {
    Shape myCircle = new Circle(10);    
    Shape mySquare = new Square(5); 
    
    System.out.println("--- Using the Shape Interface ---");
    
    printArea(myCircle); 
    printArea(mySquare); 
  }
    
  public static void printArea(Shape shape) {
    System.out.println("The area of the shape is: " 
                        + shape.calculateArea());
  }
}
