public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAfter(Node node, int value) {
        if (node == null || !(node instanceof DoublyNode)) return;
        
        DoublyNode prevNode = (DoublyNode) node;
        DoublyNode newNode = new DoublyNode(value);

        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next != null) {
            ((DoublyNode) newNode.next).prev = newNode;
        } else {
            tail = newNode; // Update tail if added at the end
        }
    }
    

    public Node get(int value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = (DoublyNode) current.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                 //pero la variable es DoublyNode (hija).
        }
        return null;
    }

    public void removeFront() {
        if (head == null) {
            return; // list is empty
        }
        if (head == tail) {
            head = null;
            tail = null; // list had one node
        } else {
            head = (DoublyNode) head.next;
            head.prev = null;
        }
    }

    public void removeEnd() {
        if (tail == null) {
            return; // list is empty
        }
        if (head == tail) {
            head = null;
            tail = null; // list had one node
        } else {
            tail = (DoublyNode) tail.prev;
            tail.next = null;
        }
    }

    public void removeNode(Node node) {
        if (node == null || !(node instanceof DoublyNode)) return;

        DoublyNode toRemove = (DoublyNode) node;

        if (toRemove == head) {
            removeFront();
            return;
        }
        if (toRemove == tail) {
            removeEnd();
            return;
        }

        if (toRemove.prev != null) {
            toRemove.prev.next = toRemove.next;
        }
        if (toRemove.next != null) {
            ((DoublyNode) toRemove.next).prev = toRemove.prev;
        }
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        DoublyNode current = head;
        while (current != null) {
            count++;
            current = (DoublyNode) current.next;
        }
        return count;
    }

    public boolean contains(int value) {
        return get(value) != null;
    }

    public void clear() {
        head = null;
        tail = null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyNode current = head;
        if (current == null) {
            return "Empty List";
        }
        while (current != null) {
            sb.append(current.toString());
            if (current.next != null) {
                sb.append(" <-> ");
            }
            current = (DoublyNode) current.next;
        }
        return sb.toString();
    }
}
