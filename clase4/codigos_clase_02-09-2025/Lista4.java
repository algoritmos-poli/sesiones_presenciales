public class Lista4 {

    static void printList(Node head) {
        if(head == null) {
            System.out.println("[ ]");
        }
        else {
            Node current = head;
            while (current != null) {
                System.out.print("[" + current.data + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        int i;
        Node list4 = null;
        list4 = new Node(10);
        list4.next = new Node(20);
        list4.next.next = new Node(30);
        list4.next.next.next = new Node(40);
        printList(list4);
        // Vamos a agregar un nodo despues de 30 y antes de 40
        Node newNode = new Node(35);
        Node current = list4;
        while (current != null) {
            if(current.data == 30) {
                break;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        // Imprimiendo la nueva lista
        printList(list4);
    }
}
