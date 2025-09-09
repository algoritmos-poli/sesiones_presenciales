// IMPLEMENTATION 1: Circle
// This class "signs the contract" and commits to implementing calculateArea().

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // MANDATORY implementation of the interface method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}