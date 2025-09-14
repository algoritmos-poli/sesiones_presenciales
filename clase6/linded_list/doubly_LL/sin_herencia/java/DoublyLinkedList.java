public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(int value) {
        Node newNode = new Node(value); // creation of new node
        if (head == null) {
            // if the list is empty
            head = newNode;
            tail = newNode;
        } else {
            // if the list is not empty
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value); // creation of new node
        if (head == null) {
            // if the list is empty
            head = newNode;
            tail = newNode;
        } else {
            // if the list is not empty
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
   
    public void addAfter(Node prevNode, int value) {
        if (prevNode == null) { // check if the previous node is null
            return; // if it is, then return
        }
        Node newNode = new Node(value); // create a new node
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null) {
            // check if the new node is not the last node
            newNode.next.prev = newNode;
        } else {
            // if the new node is the last node
            tail = newNode;
        }
    }
    
    public Node get(int value) {
        Node current = head; // start from the head
        while (current != null) {
            // traverse the list
            if (current.data == value) {
                // if the value is found
                return current; // return the node
            }
            current = current.next; // move to the next node
        }
        return null; // if the value is not found, return null
    }

    public void removeFront() {
        if (head == null) {
            return; // list is empty
        }
        if (head == tail) {
            // only one element
            head = null;
            tail = null;
        } else {
            head = head.next; // move head to the next node
            head.prev = null; // set the previous of new head to null
        }
    }   

    public void removeEnd() {
        if (head == null) {
            return; // list is empty
        }
        if (head == tail) {
            // only one element
            head = null;
            tail = null;
        } else {
            tail = tail.prev; // move tail to the previous node
            tail.next = null; // set the next of new tail to null
        }
    }   

    public void removeNode(Node node) {
        if (node == null || head == null) {
            return; // list is empty or node is null
        }
        if (node == head) {
            removeFront(); // if the node is head, remove front
            return;
        }
        if (node == tail) {
            removeEnd(); // if the node is tail, remove end
            return;
        }
        // if the node is in the middle
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void clear() {
        head = null;
        tail = null;
    }   

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            if(current.next == null) {
                System.out.print(current);
            }
            else {
                System.out.print(current + " - ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            if(current.prev == null) {
                System.out.print(current);
            }
            else {
                System.out.print(current + " - ");
            }
            current = current.prev;
        }
        System.out.println();
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(int value) {
        return get(value) != null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        if (current == null) {
            return "Empty List";
        }
        while (current != null) {
            sb.append(current.toString());
            if (current.next != null) {
                sb.append(" <-> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
