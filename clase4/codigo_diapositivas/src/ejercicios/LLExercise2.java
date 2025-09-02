package ejercicios;

public class LLExercise2 {    
    public static void main(String[] args) {
        Node list = null;
        list = new Node(10);
        list.next = new Node(20);
        // Referencia empleada para recorrer la lista
        Node current = list;
        // Recorriendo la lista hasta encontrar el ultimo
        while (current.next != null) {            
            current = current.next;
        }
        System.out.println("Ultimo nodo: " + current);
        // Agregando un nuevo nodo al final
        Node newNode = new Node(30);
        current.next = newNode; 
        // Regresando al inicio de la lista
        current = list;         
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }    
}
