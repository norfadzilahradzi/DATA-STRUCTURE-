
package Q1;

public class SLinkedList<E> {
    protected SNode<E> head, tail;
    int size = 0;
    
    public SLinkedList() {
        head = tail = null;
    }
    
    public boolean contains (E e) {
        SNode<E> current = head;
        boolean wtv = true;
        for (int i=0; i<size; i++) {
            if (current.element.equals(e)) {
                wtv = true;
            }
            else {
                wtv = false;
            }
        }
        return wtv;
    }
    
    public E remove (int index) {
        
    }
    
    
}
