public class Lista2 {
    public static void main(String[] args) {
        Node list2 = null;
        list2 = new Node(10);
        list2.next = new Node(20);

        Node t = list2;
        while(t.next != null) {
            t = t.next;
        }
        System.out.println("Agregando el nuevo elemento");
        t.next = new Node(30);
        t = t.next;
        System.out.println("Lista completa");
    }
}
