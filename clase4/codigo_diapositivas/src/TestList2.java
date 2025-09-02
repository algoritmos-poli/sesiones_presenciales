class Node {
    int data;
    Node next;
}

public class TestList2 {
    public static void main(String[] args) {
        Node list = new Node();
        list.data = 42;
        list.next = new Node();
        list.next.data = -3;
        list.next.next = new Node();
        list.next.next.data = 17;
        list.next.next.next = null;
        // System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
        System.out.println("[" + list.data + "]" + " -> "
                           + "[" + list.next.data + "]" + " -> "
                           + "[" + list.next.next.data + "]");
        // [42] -> [-3] -> [17]
    }
}