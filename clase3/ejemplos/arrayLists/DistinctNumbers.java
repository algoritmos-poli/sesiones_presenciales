import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input
            
            // Add the value if it is not in the list and is not the terminating zero
            if (!list.contains(value) && value != 0) {
                list.add(value); 
            }
        } while (value != 0);

        // Display the distinct numbers
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}