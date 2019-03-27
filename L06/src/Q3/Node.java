
package Q3;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E e, Node<E> next, Node<E> prev) {
        this.element = e;
        this.next = next;
        this.prev = prev;
    }

    public Node(E e) {
        this(e, null, null);
    }
    
    
}
