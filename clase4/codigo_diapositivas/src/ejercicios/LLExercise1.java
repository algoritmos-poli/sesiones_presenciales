package ejercicios;

public class LLExercise1 {    
    public static void main(String[] args) {
        Node list = null;
        list = new Node(10);
        list.next = new Node(20);
        // Referencia
        Node current = list;
        // Imprimiendo la lista
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }    
}
