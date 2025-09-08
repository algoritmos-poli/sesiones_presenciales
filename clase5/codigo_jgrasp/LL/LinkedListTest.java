public class LinkedListTest {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      System.out.println(list);
      list.addFirst(10);
      Node nodeSel = list.get(10);
      list.addAfter(nodeSel,20);
      list.addLast(50);
      nodeSel = list.get(20);
      list.addAfter(nodeSel,30);
      for(int i = 6; i <= 10; i++) {
         list.addLast(10*i);
      }
      list.addAfter(list.get(30),40);
      System.out.println("Tamaño:" + list.size());
      System.out.println(list);
      // Eliminar al principio
      list.remove(10);
      // Eliminar en el medio
      list.remove(50);
      // Eliminar al final
      list.remove(100);
      System.out.println(list);
      // Remover la lista
      list.clear();
      System.out.println("Tamaño: " + list.size());
      System.out.println(list);
   }
}
