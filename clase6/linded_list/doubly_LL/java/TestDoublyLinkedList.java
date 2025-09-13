public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.addFirst(10);
        ll.addFirst(5);
        ll.addLast(15);
        System.out.println(ll);  // Output: [5] <-> [10] <-> [15]
        ll.addAfter((DoublyNode) ll.get(10), 12);    
        System.out.println(ll);  // Output: [5] <-> [10] <-> [12] <-> [15]
        ll.remove(5);
        System.out.println(ll);  // Output: [10] <-> [12] <-> [15]
        System.out.println("Size: " + ll.size());  // Output: Size: 3
        System.out.println("Contains 12: " + ll.contains(12));  // Output: Contains 12: True
        ll.clear();
        System.out.println(ll);  // Output: Empty List      
    }
}
