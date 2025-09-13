public class LinkedList {
   /* ---- Attributes ---- */
   private Node head;

   /* ---- Constructor ---- */
   public LinkedList() {
      head = null;
   }

   /* ---- Methods ---- */

   public void addAfter(Node prevNode, int value) {
      if (prevNode == null) {
         return; // previous node cannot be null
      }
      Node newNode = new Node(value);
      newNode.next = prevNode.next;
      prevNode.next = newNode;
   }


   // Adds the given value to the front of the list.
   public void addFirst(int value) {
      Node newNode = new Node(value);
      if (head == null) {
         head = newNode;
      } else {
         newNode.next = head;
         head = newNode;
      }
   }

   // Adds the given value to the end of the list.
   public void addLast(int value) {
      Node newNode = new Node(value);
      if (head == null) {
         head = newNode;
      } else {
         Node current = head;
         while (current.next != null) {
            current = current.next;
         }
         current.next = newNode;
      }
   }

   // Returns the reference in list at given value.
   public Node get(int value) {
      Node current = head;
      while (current != null) {
         if (current.data == value) {
            return current;
         }
         current = current.next;
      }
      return null;
   }

   // Removes the first occurrence of the given value from the list.
   public boolean remove(int value) {
        if (head == null) {
            return false; // List is empty
        }
        if (head.data == value) {
            head = head.next; // Remove head
            return true;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data == value) {
                if (prev != null) {
                    prev.next = current.next; // Bypass the node to be removed
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false; // Value not found
    }

   public void clear() {
      head = null;
   }

   // Returns true if the list contains the given value, or false otherwise.
   public boolean contains(int value) {
      Node current = head;
      while (current != null) {
         if (current.data == value) {
            return true;
         }
         current = current.next;
      }
      return false;
   }

   // Returns the number of elements in the list.
   public int size() {
      int count = 0;
      Node current = head;
      while (current != null) {
         count++;
         current = current.next;
      }
      return count;
   }

   public boolean isEmpty() {
      return head == null;
   }

   @Override
   public String toString() {
      StringBuilder result = new StringBuilder();
      Node current = head;
      while (current != null) {
         result.append(current).append(" -> ");
         current = current.next;
      }
      result.append("null");
      return result.toString();
   }
}