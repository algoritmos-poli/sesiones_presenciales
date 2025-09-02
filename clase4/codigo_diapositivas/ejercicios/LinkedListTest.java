class Node {
	public int data;
    public Node next;
}

class LinkedList {
    // To do...
    private Node head;

    public LinkedList() {
        // To Do...
    }

    public void insertFirst() {
        // To Do...
    }

    public void deleteFirst() {
        // To Do...
    }

    public boolean isEmpty() {
        // To Do...
        return false;
    }

    public void displayList() {
        // To Do...
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertFirst(22);
        myList.insertFirst(44);
        myList.insertFirst(66);
        myList.insertFirst(88);

        myList.displayList();

        while (!myList.isEmpty())
            myList.deleteFirst();

        myList.displayList();
    }
}
