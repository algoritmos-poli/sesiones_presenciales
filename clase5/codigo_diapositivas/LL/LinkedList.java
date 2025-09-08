package clase5.codigo_diapositivas.LL;

public class LinkedList {
    /* ---- Attributes ---- */
    private Node head;
    private Node tail;

    /* ---- Constructor ---- */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /* ---- Methods ---- */

    public void addAfter(Node prevNode, int value) {
        if (prevNode == null) {
            return; // previous node cannot be null
        }
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        if (newNode.next == null) {
            tail = newNode; // update tail if new node is added at the end
        }
    }


    // Adds the given value to the front of the list.
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Adds the given value to the end of the list.
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
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

    // Removes the first occurrence of the given value from the list.
    public boolean remove(int value) {
        // Case 1: Handle an empty list.
        if (head == null) {
            return false;
        }

        // Case 2: Handle removing the head node.
        if (head.data == value) {
            if (head == tail) { // This is the only node in the list
                head = null;
                tail = null;
            } else {
                head = head.next; // Move the head to the next node
            }
            return true;
        }

        // Case 3: Traverse the list to find the node.
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            if (current.data == value) {
                // Node found. Unlink it by updating the previous node's 'next' pointer.
                previous.next = current.next;

                // If the tail was the node removed, update the tail pointer.
                if (current == tail) {
                    tail = previous;
                }
                return true;
            }
            // Move pointers forward for the next iteration.
            previous = current;
            current = current.next;
        }
        // If the loop finishes, the value was not found in the list.
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
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

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}