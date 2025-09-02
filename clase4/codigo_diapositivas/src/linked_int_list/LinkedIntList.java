package linked_int_list;

public class LinkedIntList {
    /* ---- Attributes ---- */
    private Node head;

    /* ---- Constructor ---- */
    public LinkedIntList() {
        head = null;
    }

    /* ---- Methods ---- */
    
    // Adds the given value to the end of the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            // adding to an empty list
            head = newNode;
        } else {
            // adding to the end of an existing list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Returns the reference in list at given value.
    public Node get(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Removes the first occurrence of the given value from the list, returning true if the value was found and removed, 
    // or false if the value was not found.
    public boolean remove(int value) {
        if (head == null) {
            return false; // List is empty
        }
        if (head.data == value) {
            head = head.next; // Remove head
            return true;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data == value) {
                if (prev != null) {
                    prev.next = current.next; // Bypass the node to be removed
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false; // Value not found
    }

    // Returns true if the list contains the given value, or false otherwise.
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns the number of elements in the list.
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String display() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}
