public class LinkedList {
    private Node head; // Head of the list

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Method to add a new node at the end
    public void add(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove a node by value
    public Node contains(Integer data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    /*
    // Method to remove a node by value
    public void remove(Integer data) {
        if (head == null) return;

        // If the head needs to be removed
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    */

    public void remove(Integer data) {
        Node nodeToRemove = contains(data);

        if (nodeToRemove == null) {
            return;
        }

        // Case 1: The node to remove is the head of the list.
        if (nodeToRemove == head) {
            head = head.next;
            return;
        }

        // Case 2: The node is in the middle or at the end of the list.
        // We need to find the node *before* the one we want to remove.
        Node current = head;
        while (current != null && current.next != nodeToRemove) {
            current = current.next;
        }

        // If we found the predecessor, bypass the node to remove.
        if (current != null) {
            current.next = nodeToRemove.next;
        }
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
