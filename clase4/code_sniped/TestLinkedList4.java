package clase4.code_sniped;

class Node {
   /* ---- Atributos ---- */
   Integer data;
   Node next = null;

   /* ---- Constructor ---- */
   public Node(Integer data) {
      this.data = data;
      this.next = null;
   }

}

class LinkedList {
   /* ---- Atributos ---- */
   Node head;

   /* ---- Constructor ---- */
   public LinkedList() {
      head = null;
   }

   /* ---- Metodos ---- */
   // display()
   void display() {
      Node actual = head;
      if (actual == null) {
         System.out.println("Lista vacia: [ ]");
      } else {
         while (actual != null) {
            System.out.print("[" + actual.data + "] -> ");
            actual = actual.next;
         }
         System.out.println("NULL");
      }
   }

   // add()
   public void add(Integer data) {
      Node newNode = new Node(data);
      if (head == null) {
         // Caso 1: lista vacia
         head = newNode;
      } else {
         // Caso 2: Lista no vacia
         Node current = head;
         while (current.next != null) {
            current = current.next;
         }
         current.next = newNode;
      }
   }

   // remove()
   public Node remove(Integer data) {
      // Caso 1: La lista está vacía.
      if (head == null) {
         return null;
      }

      // Caso 2: El nodo a eliminar es el 'head'.
      if (head.data.equals(data)) {
         Node removedNode = head; // Guardamos el nodo a eliminar para retornarlo.
         head = head.next;        // Movemos el head al siguiente nodo.
         return removedNode;
      }

      // Caso 3: El nodo a eliminar está en medio o al final.
      Node prev = head;
      Node current = head.next;

      // Recorremos el resto de la lista.
      while (current != null) {
         if (current.data.equals(data)) {
            // Encontramos el nodo. Lo "saltamos" cambiando el puntero 'next' del anterior.
            prev.next = current.next;
            return current; // Retornamos el nodo eliminado.
         }
         // Avanzamos ambos punteros.
         prev = current;
         current = current.next;
      }
      // Si el bucle termina, el elemento no se encontró.
      return null;
   }
}

public class TestLinkedList4 {
   public static void main(String[] args) {
      // Ejemplos
      LinkedList LL = new LinkedList(); // |HEAD| -> NULL
      LL.add(10); // |HEAD| -> [10] -> NULL
      LL.add(20); // |HEAD| -> [10] -> [20] -> NULL
      LL.add(30); // |HEAD| -> [10] -> [20] -> [30] -> NULL
      LL.add(40); // |HEAD| -> [10] -> [20] -> [30] -> [40] -> NULL
      // despliegue de la LL
      LL.display(); // Salida: [10] -> [20] -> [30] -> [40] -> NULL
      // Removiendo el primer elemento de la lista
      Node removedNode = null;
      // Removiendo un nodo que no existe
      int dataNonExist = 50;
      removedNode = LL.remove(dataNonExist);
      System.out.println((removedNode != null ? removedNode.data : dataNonExist + " no existe en la lista"));
      // Removiendo un nodo que existe
      removedNode = LL.remove(10);
      System.out.println("Nodo removido: " + (removedNode != null ? removedNode.data : "null"));
      LL.display(); // Salida: [20] -> [30] -> [40] -> NULL
      // Removiendo un nodo de la mitad
      removedNode = LL.remove(30);
      System.out.println("Nodo removido: " + (removedNode != null ? removedNode.data : "null"));
      LL.display(); // Salida: [20] -> [40] -> NULL
      // Removiendo el último elemento de la lista
      removedNode = LL.remove(40);
      System.out.println("Nodo removido: " + (removedNode != null ? removedNode.data : "null"));
      LL.display(); // Salida: [20] -> NULL
      // Removiendo el único elemento de la lista
      removedNode = LL.remove(20);
      System.out.println("Nodo removido: " + (removedNode != null ? removedNode.data : "null"));
      LL.display(); // Salida: [ ] -> NULL
   }
}