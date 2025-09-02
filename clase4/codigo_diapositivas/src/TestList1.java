class Node {
    int data;
    Node next;
}

public class TestList1 {
    public static void main(String[] args) {
        Node list;
        // Creando nodos
        Node node1 = new Node();
        node1.data = 42;
        Node node2 = new Node();
        node2.data = -3;
        Node node3 = new Node();
        node3.data = 17;
        // Enlazando nodos
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        list = node1;        
        // System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
        System.out.println("[" + list.data + "]" + " -> "
                           + "[" + list.next.data + "]" + " -> "
                           + "[" + list.next.next.data + "]");
        // [42] -> [-3] -> [17]
    }
}