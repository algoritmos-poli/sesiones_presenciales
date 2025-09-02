package ejercicios;

public class PrintCompare {    
    public static void main(String[] args) {
        // Array
        System.out.println("Array:");
        int[] array = {10, 20, 30};
        printArray(array);

        // Lista enlazada
        Node list = null;
        list = new Node(10);
        list.next = new Node(20);
        list.next.next = new Node(30);
        System.out.println("Linked List:");
        printList(list);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
