// IMPLEMENTATION 2: Square
// This class also signs the contract and fulfills it in its own way.

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // MANDATORY implementation of the interface method
    @Override
    public double calculateArea() {
        return side * side;
    }
}