/*
 * =================================================================================
 * FILE 2: ShoppingCart.java
 * This class manages a collection of Product objects using an ArrayList.
 * =================================================================================
 */
import java.util.ArrayList;

class ShoppingCart {
    // We use an ArrayList to store the list of products.
    private ArrayList<Product> items;

    /**
     * Constructs a new, empty ShoppingCart.
     */
    public ShoppingCart() {
        // Initialize the ArrayList when a new cart is created.
        this.items = new ArrayList<>();
    }

    /**
     * Adds a product to the cart.
     * @param product The Product object to add.
     */
    public void addProduct(Product product) {
        this.items.add(product);
        System.out.println(product.getName() + " was added to the cart.");
    }

    /**
     * Removes a product from the cart based on the product object.
     * @param product The Product object to remove.
     */
    public void removeProduct(Product product) {
        if (this.items.remove(product)) {
            System.out.println(product.getName() + " was removed from the cart.");
        } else {
            System.out.println(product.getName() + " was not found in the cart.");
        }
    }

    /**
     * Calculates the total price of all items in the cart.
     * @return The total price as a double.
     */
    public double getTotalPrice() {
        double total = 0.0;
        // Loop through each product in the 'items' list and sum up their prices.
        for (Product item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * Displays all the items currently in the cart.
     */
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The shopping cart is empty.");
            return;
        }

        System.out.println("\n--- Items in your cart ---");
        for (Product item : this.items) {
            // This implicitly calls the toString() method of the Product class
            System.out.println("- " + item);
        }
        System.out.println("--------------------------");
    }

    /**
     * Removes all items from the cart.
     */
    public void clearCart() {
        this.items.clear();
        System.out.println("The cart has been cleared.");
    }
}