package clase5.codigo_diapositivas.all;

public class TestListInterface {
    public static void main(String[] args) {
        
        SimpleLinkedList SLL = new SimpleLinkedList();
        SLL.addFirst(10);
        SLL.addLast(30);
        SLL.addAfter(SLL.get(10), 20);
        System.out.println(SLL);
        System.out.println("Tamaño: " + SLL.size());
        System.out.println("¿Está vacía? " + SLL.isEmpty());
        SLL.remove(10);
        System.out.println(SLL);
        SLL.clear();
        System.out.println("Tamaño: " + SLL.size());
        System.out.println(SLL);

        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.addFirst(10); 
        DLL.addLast(30);
        DLL.addAfter(DLL.get(10), 20);
        System.out.println(DLL);
        System.out.println("Tamaño: " + DLL.size());
        System.out.println("¿Está vacía? " + DLL.isEmpty());    
        DLL.remove(20);
        System.out.println(DLL);
        DLL.clear();    
        System.out.println("Tamaño: " + DLL.size());
        System.out.println(DLL);
    }
}
