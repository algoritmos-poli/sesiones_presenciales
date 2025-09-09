package clase5.codigo_diapositivas.all;

public interface ListInterface {
    void addFirst(int data);
    void addLast(int data);
    void addAfter(Node node, int data);
    Node get(int data);
    void remove(int data);
    int size();
    void clear();
    boolean isEmpty();
}
