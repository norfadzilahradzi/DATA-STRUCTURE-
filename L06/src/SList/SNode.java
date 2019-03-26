
package SList;

public class SNode<E> {
    E element;
    SNode<E> next;
//    SNode<E> prev;

    public SNode() {
        this.element = null;
        this.next = null;
//        this.prev = null;
    }
    
    public SNode(E e) {
        this.element = e;
        this.next = null;
//        this.prev = null;
    }
    
    
    
}
