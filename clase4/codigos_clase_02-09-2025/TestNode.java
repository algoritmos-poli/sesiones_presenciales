public class TestNode {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        System.out.println("node1: ");
        System.out.println("- node1.data: " + node1.data);
        System.out.println("- node1.data: " + node1.next);
        System.out.println("node2: ");
        System.out.println("- node1.data: " + node2.data);
        System.out.println("- node1.data: " + node2.next);
        System.out.println("node3: ");
        System.out.println("- node1.data: " + node3.data);
        System.out.println("- node1.data: " + node3.next);
        // Enlazado
        node1.next = node2;
        node2.next = node3;
        System.out.println("Despues de enlazar");
        System.out.println("node1: ");
        System.out.println("- node1.data: " + node1.data);
        System.out.println("- node1.data: " + node1.next);
        System.out.println("node2: ");
        System.out.println("- node1.data: " + node2.data);
        System.out.println("- node1.data: " + node2.next);
        System.out.println("node3: ");
        System.out.println("- node1.data: " + node3.data);
        System.out.println("- node1.data: " + node3.next);




    }
}
