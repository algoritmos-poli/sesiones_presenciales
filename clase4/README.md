# Listas enlazadas

## Introducción

## Sobre las listas enlazadas

## Implementación

## Ejemplos

### Ejemplo 1

Vamos a implementar una lista enlazada desde 0.
* Defina la clase Nodo.
  
  ```java
  public class Node {
    /* ---- Atributos ---- */
    Object data; // Objeto en general
    Node next;
    
    /* ---- Constructor ---- */
    public Node(Object data) {
      this.data = data;
      this.next = null;
    }
    
    /* ---- Metodos ---- */
    // Code...
  }
  ```

* Defina la clase linked List.

  ```java
  public class LinkedList {
    /* ---- Atribudos ---- */
    Node head;
    
    /* ---- Constructor ---- */
    public LinkedList() {
      this.head = null;
    }
    
    /* ---- Metodos ---- */
    // add
    // display
    // remove
    // ...
  }
  ```

2. Defina cada uno de los metodos:
   
   * **Metodo `add`**:

     ```java
     public class LinkedList {
       /* ---- Atributos ---- */
       Node head;
    
       /* ---- Constructor ---- */
       public LinkedList() {
         this.head = null;
       }
       
       /* ---- Metodos ---- */
       // add
       public void add(Object data) {      
         Node newNode = new Node(data);      
         if (this.head == null) {
           // Caso 1: Lista vacia
           this.head = new Node(data);
         } 
         else {
           // Caso 2: Lista no vacia
           Node current = this.head;
           while (current.next != null) {
             current = current.next;
           }
           current.next = newNode;      
         }
         // Otros metodos
         // Code...
       }
       // ...
     }
     ```  
  
   * **Metodo `display`**:
     
     ```java
     public class LinkedList {
       /* ---- Atribudos ---- */
       Node head;
    
       /* ---- Constructor ---- */
       public LinkedList() {
         this.head = null;
       }      
       
       /* ---- Metodos ---- */
       // display
       public void display() {       
         Node current = this.head;
         while (current != null) {
           System.out.print(current.data + " -> ");
           current = current.next;
         }
         System.out.println("null");
       }       
       // Otros metodos
       // Code...     
     }
     ```

* **Metodo `remove`**:

     ```java
     public class LinkedList {
       /* ---- Atribudos ---- */
       Node head;
    
       /* ---- Constructor ---- */
       public LinkedList() {
         this.head = null;
       }      
       
       /* ---- Metodos ---- */
       // remove
       public void remove(Integer data) {
         // La lista enlazada esta vacia 
         if (this.head == null) {
           return;
         }
         // Primer elemento es el que se elimina
         if (this.head.data.equals(data)) {
            this.head = this.head.next;
            return;
         }
         // Elemento a eliminar no esta en la cabeza
         Node current = head;
         while (current.next != null) {
           if (current.next.data.equals(data)) {
             current.next = current.next.next;
               return;
            }
            current = current.next;
         } 
       }   
       // Otros metodos
       // Code...     
     }
     ```



