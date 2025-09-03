public class Lista3 {
    public static void main(String[] args) {
        Node list3 = null;
        list3 = new Node(10);
        list3.next = new Node(20); // [10] -> [20] -> null
        // Agregando un nuevo nodo al principio

        Node newNode = new Node(30);
        newNode.next = list3;
        list3 = newNode;
        // Imprimiendo la lista
        Node temp = list3;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
