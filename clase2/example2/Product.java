/*
 * =================================================================================
 * FILE 1: Product.java
 * This class defines a product with a name and a price.
 * =================================================================================
 */
class Product {
    private String name;
    private double price;

    /**
     * Constructs a new Product.
     * @param name The name of the product (e.g., "Milk").
     * @param price The price of the product (e.g., 2.50).
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for the product's name
    public String getName() {
        return name;
    }

    // Getter for the product's price
    public double getPrice() {
        return price;
    }

    /**
     * Provides a user-friendly string representation of the product.
     * This is useful for printing the object directly.
     */
    @Override
    public String toString() {
        // Formats the price to two decimal places
        return name + " - $" + String.format("%.2f", price);
    }
}
