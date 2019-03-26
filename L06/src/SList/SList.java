
package SList<E>;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        
        if (tail == null) {
            tail = head;
        }
    }
    
    public E removeInitial() {
        if (size == 0) {
            return null;
        }
        else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }
    
    public boolean contains(E e) {
        SNode<E> current = head;
        for (int i=0; i<size; i++) {
            if (current.element.equals(e)) {
                current = current.next;
                return true;
            }
           else
                return false;
        }
    }
    
    public void clear() {
        for (int i=1; i<size; i++) {
            while (size != 0) {
                removeInitial();
            }
        }
    }
    
    public void display() {
        if (size == 0) {
            System.out.println("The list is empty.");
        }
        else {
            SNode<E> current = head;
            for (int i=0; i<size; i++) {
                System.out.print(current.element + " ");
                current = current.next;
            }
        }
    }
    
}
