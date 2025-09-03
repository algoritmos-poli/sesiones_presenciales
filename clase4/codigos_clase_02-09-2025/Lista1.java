public class Lista1 {
    public static void main(String[] args) {
        Node list1 = null;
        /*
        Node n1 = new Node(10);
        list1 = n1;
        */
        list1 = new Node(10);
        list1.next = new Node(20);    // n1.next = new Node(20);
        list1.next.next = new Node(30);
        System.out.println("[10] -> [20] -> [30]");
        Node temp = null;
        temp = list1;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}
