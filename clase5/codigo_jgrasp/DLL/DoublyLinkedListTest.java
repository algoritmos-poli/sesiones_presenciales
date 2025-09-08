public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFront(10);
        dll.addEnd(50);
        Node node = dll.get(10);
        if (node != null) {
            dll.addAfter(node, 20);
        }
        dll.addAfter(dll.get(20), 30);

        System.out.println("Tamaño: " + dll.size()); // Expected: 7
        System.out.println(dll); // Expected: 10 <-> 20 <-> 30 <-> 50 <-> null
        
        System.out.println("Traverse Forward:");
        dll.traverseForward(); // Expected: 10 - 20 - 30 - 50 - null

        System.out.println("Traverse Backward:");
        dll.traverseBackward(); // Expected: 50 - 30 - 20 - 10 - null

        for (int i = 6; i <= 10; i++) {
            dll.addEnd(10 * i);
        }

        dll.addAfter(dll.get(30), 40);

        System.out.println("Tamaño: " + dll.size()); // Expected: 7
        System.out.println(dll); // Expected: 10 <-> 20 <-> 30 <-> 40 <-> 60 <-> 70 <-> 80 <-> 90 <-> 100 <-> null

        // Remove from the front
        dll.removeFront();
        // Remove from the middle
        dll.removeEnd();
        // Remove from the end
        dll.removeNode(dll.get(50));
        System.out.println(dll); // Expected: 20 <-> 30 <-> 40 <-> 60 <-> 70 <-> 80 <-> 90 <-> null
        dll.clear();
        System.out.println(dll); // Expected: 20 <-> 30 <-> 40 <-> 60 <-> 70 <-> 80 <-> 90 <-> null
    }
}
