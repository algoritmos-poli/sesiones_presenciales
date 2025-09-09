public class DoublyNode extends Node {
    
    // Atributo adicional para apuntar al nodo previo
    Node prev;

    public DoublyNode() {
        super(); 
        this.prev = null;
    }

    public DoublyNode(int data) {
        super(data); 
        this.prev = null;
    }
}

