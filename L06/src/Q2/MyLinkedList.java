
package Q2;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList(Node<E> head, Node<E> tail, int size) {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        
        if( tail == null) {
            tail = head;
        }
    }
    
    public void removeElement(E e) {
        
    }
    
    public void printList() {
        
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean contains(E e) {
        
    }
    
    public void replace(E e, E newE) {
        
    }
    
}
