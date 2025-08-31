# Codigos ejemplo

## Creacion del codigo paso a paso

A continuación se muestra el paso a paso de la declaración de la clases paso a paso.

### Paso 1 - Clase Node

```java
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

public class TestNode {
   public static void main(String[] args) {
      // Ejemplos
      Node node1 = new Node(10); // [10] -> NULL
      Node node2 = new Node(20); // [20] -> NULL
      Node node3 = new Node(30); // [30] -> NULL
      // Enlazando los nodos
      node1.next = node2;        // [10] -> [20] -> NULL
      node2.next = node3;        // [10] -> [20] -> [30] -> NULL
      // Imprimiendo la lista
      Node nodeRef = node1;      // |NODEREF| -> [20] -> [30] -> NULL
      while(nodeRef != null) {
         System.out.print("["+ nodeRef.data + "] -> ");
         nodeRef = nodeRef.next;
      }
      System.out.println("NULL");
   }
}
```

**Simulación**: [link](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=class+Node+%7B%0A+++/*+----+Atributos+----+*/%0A+++Integer+data%3B%0A+++Node+next+%3D+null%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+Node(Integer+data)+%7B%0A++++++this.data+%3D+data%3B%0A++++++this.next+%3D+null%3B%0A+++%7D%0A+++%0A%7D%0A%0Apublic+class+TestNode+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++//+Ejemplos%0A++++++Node+node1+%3D+new+Node(10)%3B%0A++++++Node+node2+%3D+new+Node(20)%3B%0A++++++Node+node3+%3D+new+Node(30)%3B%0A++++++//+Enlazando+los+nodos%0A++++++node1.next+%3D+node2%3B%0A++++++node2.next+%3D+node3%3B%0A++++++//+Imprimiendo+la+lista%0A++++++Node+nodeRef+%3D+node1%3B%0A++++++while(nodeRef+!%3D+null)+%7B%0A+++++++++System.out.print(%22%5B%22%2B+nodeRef.data+%2B+%22%5D+-%3E+%22)%3B%0A+++++++++nodeRef+%3D+nodeRef.next%3B%0A++++++%7D%0A++++++System.out.println(%22NULL%22)%3B%0A+++%7D%0A%7D&mode=display&curInstr=0)


### Paso 2 - Clase LinkedList

```java
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
   // display()...
   // add()...    
   // remove()...    
}

public class TestLinkedList1 {
   public static void main(String[] args) {
      // Ejemplos
      Node node1 = new Node(10); // [10] -> NULL
      Node node2 = new Node(20); // [20] -> NULL
      Node node3 = new Node(30); // [30] -> NULL
      // Enlazando los nodos
      node1.next = node2; // [10] -> [20] -> NULL
      node2.next = node3; // [10] -> [20] -> [30] -> NULL    
      LinkedList LL = new LinkedList(); // |HEAD| -> NULL
      LL.head = node1; // Inicializando el head
      // Imprimiendo la lista
      Node nodeRef = LL.head; // |HEAD| -> NULL
                              //            ^
                              //            |
                              //        |NODEREF|
      while(nodeRef != null) {
         System.out.print("["+ nodeRef.data + "] -> ");
         nodeRef = nodeRef.next;
      }
      System.out.println("NULL");
   }
}
```

**Simulación**: [link](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=class+Node+%7B%0A+++/*+----+Atributos+----+*/%0A+++Integer+data%3B%0A+++Node+next+%3D+null%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+Node(Integer+data)+%7B%0A++++++this.data+%3D+data%3B%0A++++++this.next+%3D+null%3B%0A+++%7D%0A+++%0A%7D%0A%0Aclass+LinkedList+%7B+%0A+++/*+----+Atributos+----+*/%0A+++Node+head%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+LinkedList()+%7B%0A++++++head+%3D+null%3B+++%0A+++%7D++%0A%7D%0A%0Apublic+class+TestLinkedList1+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++//+Ejemplos%0A++++++Node+node1+%3D+new+Node(10)%3B%0A++++++Node+node2+%3D+new+Node(20)%3B%0A++++++Node+node3+%3D+new+Node(30)%3B%0A++++++//+Enlazando+los+nodos%0A++++++node1.next+%3D+node2%3B%0A++++++node2.next+%3D+node3%3B++++++%0A++++++LinkedList+LL+%3D+new+LinkedList()%3B%0A++++++LL.head+%3D+node1%3B+//+Inicializando+el+head%0A++++++//+Imprimiendo+la+lista%0A++++++Node+nodeRef+%3D+LL.head%3B+//+Inic.nodeRef+que+va+a+barrer+la+LL%0A++++++while(nodeRef+!%3D+null)+%7B%0A+++++++++System.out.print(%22%5B%22%2B+nodeRef.data+%2B+%22%5D+-%3E+%22)%3B%0A+++++++++nodeRef+%3D+nodeRef.next%3B%0A++++++%7D%0A++++++System.out.println(%22NULL%22)%3B%0A+++%7D%0A%7D&mode=display&curInstr=0)

### Paso 3 - Metodos de la clase LinkedList


#### Paso 3.1. Metodo `display`

```java
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
      if(actual == null) {
         System.out.println("Lista vacia: [ ]");
      }
      else {
         while(actual != null) {
            System.out.print("["+ actual.data + "] -> ");
            actual = actual.next;
         }
         System.out.println("NULL");
      }
   }
   // add...    
   // remove...    
}

public class TestLinkedList2 {
   public static void main(String[] args) {
      // Ejemplos
      Node node1 = new Node(10); // [10] -> NULL
      Node node2 = new Node(20); // [20] -> NULL
      Node node3 = new Node(30); // [30] -> NULL 
      // Enlazando los nodos
      node1.next = node2; // [10] -> [20] -> NULL
      node2.next = node3; // [10] -> [20] -> [30] -> NULL
      LinkedList LL = new LinkedList();
      LL.head = node1; // |HEAD| -> [10] -> [20] -> [30] -> NULL
      // despliegue de la LL
      LL.display(); // Salida: [10] -> [20] -> [30] -> NULL
   }
}
```

**Simulación**: [link](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=class+Node+%7B%0A+++/*+----+Atributos+----+*/%0A+++Integer+data%3B%0A+++Node+next+%3D+null%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+Node(Integer+data)+%7B%0A++++++this.data+%3D+data%3B%0A++++++this.next+%3D+null%3B%0A+++%7D%0A+++%0A%7D%0A%0Aclass+LinkedList+%7B+%0A+++/*+----+Atributos+----+*/%0A+++Node+head%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+LinkedList()+%7B%0A++++++head+%3D+null%3B+++%0A+++%7D++%0A%0A+++/*+----+Metodos+----+*/%0A+++//+display()%0A+++void+display()+%7B%0A++++++Node+actual+%3D+head%3B%0A++++++if(actual+%3D%3D+null)+%7B%0A+++++++++System.out.println(%22Lista+vacia%3A+%5B+%5D%22)%3B%0A++++++%7D%0A++++++else+%7B%0A+++++++++while(actual+!%3D+null)+%7B%0A++++++++++++System.out.print(%22%5B%22%2B+actual.data+%2B+%22%5D+-%3E+%22)%3B%0A++++++++++++actual+%3D+actual.next%3B%0A+++++++++%7D%0A+++++++++System.out.println(%22NULL%22)%3B%0A++++++%7D%0A+++%7D%0A+++//+add...++++%0A+++//+remove...++++%0A%7D%0A%0Apublic+class+TestLinkedList2+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++//+Ejemplos%0A++++++Node+node1+%3D+new+Node(10)%3B+//+%5B10%5D+-%3E+NULL%0A++++++Node+node2+%3D+new+Node(20)%3B+//+%5B20%5D+-%3E+NULL%0A++++++Node+node3+%3D+new+Node(30)%3B+//+%5B30%5D+-%3E+NULL+%0A++++++//+Enlazando+los+nodos%0A++++++node1.next+%3D+node2%3B+//+%5B10%5D+-%3E+%5B20%5D+-%3E+NULL%0A++++++node2.next+%3D+node3%3B+//+%5B10%5D+-%3E+%5B20%5D+-%3E+%5B30%5D+-%3E+NULL%0A++++++LinkedList+LL+%3D+new+LinkedList()%3B%0A++++++LL.head+%3D+node1%3B+//+%7CHEAD%7C+-%3E+%5B10%5D+-%3E+%5B20%5D+-%3E+%5B30%5D+-%3E+NULL%0A++++++//+despliegue+de+la+LL%0A++++++LL.display()%3B+//+Salida%3A+%5B10%5D+-%3E+%5B20%5D+-%3E+%5B30%5D+-%3E+NULL%0A+++%7D%0A%7D&mode=display&curInstr=0)

#### Paso 3.2. Metodo `add`

```java
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
      if(actual == null) {
         System.out.println("Lista vacia: [ ]");
      }
      else {
         while(actual != null) {
            System.out.print("["+ actual.data + "] -> ");
            actual = actual.next;
         }
         System.out.println("NULL");
      }
   }
   // add()
   public void add(Integer data) {
      Node newNode = new Node(data);
      if(head == null) {
         // Caso 1: lista vacia
         head = newNode;
      }
      else {         
         // Caso 2: Lista no vacia
         Node current = head;         
         while(current.next != null) {
            current = current.next;            
         }         
         current.next = newNode;
      }
   }
   // remove...    
}

public class TestLinkedList3 {
   public static void main(String[] args) {
      // Ejemplos    
      LinkedList LL = new LinkedList(); // |HEAD| -> NULL
      LL.add(10); // |HEAD| -> [10] -> NULL
      LL.add(20); // |HEAD| -> [10] -> [20] -> NULL
      LL.add(30); // |HEAD| -> [10] -> [20] -> [30] -> NULL
      // despliegue de la LL
      LL.display(); // Salida: [10] -> [20] -> [30] -> NULL
   }
}
```

**Simulación**: [link](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=class+Node+%7B%0A+++/*+----+Atributos+----+*/%0A+++Integer+data%3B%0A+++Node+next+%3D+null%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+Node(Integer+data)+%7B%0A++++++this.data+%3D+data%3B%0A++++++this.next+%3D+null%3B%0A+++%7D%0A+++%0A%7D%0A%0Aclass+LinkedList+%7B+%0A+++/*+----+Atributos+----+*/%0A+++Node+head%3B%0A+++%0A+++/*+----+Constructor+----+*/%0A+++public+LinkedList()+%7B%0A++++++head+%3D+null%3B+++%0A+++%7D++%0A%0A+++/*+----+Metodos+----+*/%0A+++//+display()%0A+++void+display()+%7B%0A++++++Node+actual+%3D+head%3B%0A++++++if(actual+%3D%3D+null)+%7B%0A+++++++++System.out.println(%22Lista+vacia%3A+%5B+%5D%22)%3B%0A++++++%7D%0A++++++else+%7B%0A+++++++++while(actual+!%3D+null)+%7B%0A++++++++++++System.out.print(%22%5B%22%2B+actual.data+%2B+%22%5D+-%3E+%22)%3B%0A++++++++++++actual+%3D+actual.next%3B%0A+++++++++%7D%0A+++++++++System.out.println(%22NULL%22)%3B%0A++++++%7D%0A+++%7D%0A+++//+add()%0A+++public+void+add(Integer+data)+%7B%0A++++++Node+newNode+%3D+new+Node(data)%3B%0A++++++if(head+%3D%3D+null)+%7B%0A+++++++++//+Caso+1%3A+lista+vacia%0A+++++++++head+%3D+newNode%3B%0A++++++%7D%0A++++++else+%7B+++++++++%0A+++++++++//+Caso+2%3A+Lista+no+vacia%0A+++++++++Node+current+%3D+head%3B+++++++++%0A+++++++++while(current.next+!%3D+null)+%7B%0A++++++++++++current+%3D+current.next%3B++++++++++++%0A+++++++++%7D+++++++++%0A+++++++++current.next+%3D+newNode%3B%0A++++++%7D%0A+++%7D%0A+++//+remove...++++%0A%7D%0A%0Apublic+class+TestLinkedList3+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++//+Ejemplos++++%0A++++++LinkedList+LL+%3D+new+LinkedList()%3B+//+%7CHEAD%7C+-%3E+NULL%0A++++++LL.add(10)%3B+//+%7CHEAD%7C+-%3E+%5B10%5D+-%3E+NULL%0A++++++LL.add(20)%3B+//+%7CHEAD%7C+-%3E+%5B10%5D+-%3E+%5B20%5D+-%3E+NULL%0A++++++LL.add(30)%3B+//+%7CHEAD%7C+-%3E+%5B10%5D+-%3E+%5B20%5D+-%3E+%5B30%5D+-%3E+NULL%0A++++++//+despliegue+de+la+LL%0A++++++LL.display()%3B+//+Salida%3A+%5B10%5D+-%3E+%5B20%5D+-%3E+%5B30%5D+-%3E+NULL%0A+++%7D%0A%7D&mode=display&curInstr=0)


#### Paso 3.3. Metodo `remove`:

```java
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
```

**Simulación**: [TestLinkedList4.java](./code_sniped/TestLinkedList4.java)