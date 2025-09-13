public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }


    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAfter(DoublyNode prevNode, int data) {
        if (prevNode == null) return;

        DoublyNode newNode = new DoublyNode(data);

        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next != null) { // If not inserting at the end
            newNode.next.prev = newNode;
        } else { // If inserting at the end
            tail = newNode; // Update tail if added at the end
        }
    }

    public DoublyNode get(int data) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = (DoublyNode) current.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                 //pero la variable es DoublyNode (hija).
        }
        return null;
    }

    public void remove(int data) {
        if (head == null) return;

        // Caso 1: El nodo a eliminar es la cabeza (head)
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // La lista ahora está vacía
            }
            return;
        }

        // Caso 2: El nodo está en el medio o al final
        DoublyNode current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        // Si se encontró el nodo (current no es null)
        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                // Se está eliminando la cola, la nueva cola es el nodo anterior
                tail = current.prev;
            }
            
            if (current.prev != null) {
                current.prev.next = current.next;
            }
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
            current = current.next;
        }
        return count;
    }

    public boolean contains(int value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public void clear() {
        head = null;
        tail = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyNode current = head;
        if (current == null) {
            return "Empty List";
        }
        while (current != null) {
            sb.append("[").append(current.data).append("] <-> ");
            current = current.next;
        }        
        return sb.toString();
    }
}
