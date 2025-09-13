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

    
    public void addAfter(Node node, int data) {
        if (node == null || !(node instanceof DoublyNode)) return;
        
        DoublyNode prevNode = (DoublyNode) node;
        DoublyNode newNode = new DoublyNode(data);

        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next != null) {
            ((DoublyNode) newNode.next).prev = newNode;
        } else {
            tail = newNode; // Update tail if added at the end
        }
    }

    
    public Node get(int data) {
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
            head = (DoublyNode) head.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                           //pero la variable es DoublyNode (hija).
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
            current = (DoublyNode) current.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                 //pero la variable es DoublyNode (hija).
        }

        // Si se encontró el nodo (current no es null)
        if (current != null) {
            if (current.next != null) {
                ((DoublyNode) current.next).prev = current.prev;
            } else {
                // Se está eliminando la cola, la nueva cola es el nodo anterior
                tail = (DoublyNode) current.prev; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                  //pero la variable es DoublyNode (hija).
            }
            
            if (current.prev != null) {
                ((DoublyNode) current.prev).next = current.next;
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
            current = (DoublyNode) current.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                 //pero la variable es DoublyNode (hija).
        }
        return count;
    }


    public void clear() {
        head = null;
        tail = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("null <- ");
        DoublyNode current = head;
        while (current != null) {
            sb.append("[").append(current.data).append("] <-> ");
            current = (DoublyNode) current.next; // Cast necesario: .next devuelve un tipo Node (padre), 
                                                 //pero la variable es DoublyNode (hija).
        }
        if (sb.length() > 8) {
             sb.setLength(sb.length() - 5); // Elimina el último " <-> "
        }
        sb.append(" -> null");
        return sb.toString();
    }
}
