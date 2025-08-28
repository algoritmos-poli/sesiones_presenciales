/*
 * =================================================================================
 * FILE 3: Store.java
 * This is the main class with a `main` method to run the example.
 * To run this code, save all three classes in their respective .java files
 * and compile and run the Store.java file.
 * =================================================================================
 */
public class Store {
    public static void main(String[] args) {
        // 1. Create a new shopping cart
        ShoppingCart myCart = new ShoppingCart();

        // 2. Create some products to work with
        Product milk = new Product("Milk", 2.50);
        Product bread = new Product("Bread", 1.75);
        Product eggs = new Product("Eggs", 3.20);
        Product apples = new Product("Apples", 0.99);

        // 3. Add products to the cart
        System.out.println("--- Adding products to the cart ---");
        myCart.addProduct(milk);
        myCart.addProduct(bread);
        myCart.addProduct(eggs);
        
        // 4. Display the items and the total price
        myCart.displayItems();
        System.out.println(String.format("Current Total: $%.2f", myCart.getTotalPrice()));

        // 5. Remove a product from the cart
        System.out.println("\n--- Removing a product ---");
        myCart.removeProduct(bread);

        // 6. Display the items and total price again
        myCart.displayItems();
        System.out.println(String.format("New Total: $%.2f", myCart.getTotalPrice()));
        
        // 7. Clear the entire cart
        System.out.println("\n--- Clearing the cart ---");
        myCart.clearCart();
        myCart.displayItems();
    }
}
