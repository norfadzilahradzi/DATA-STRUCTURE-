
package Q2;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //ADDLAST METHOD
    public void add(E e) {
        if( tail == null) {
            tail = head = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void removeElement(E e) {
        if (size == 0) {
            System.out.println("Nothing to remove");
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            System.out.println(temp.element);
        }
    }
    
    public void printList() {
        if (size == 0) {
            System.out.println("The list is empty.");
        }
        else {
            Node<E> current = head;
            for (int i=0; i<size; i++) {
                System.out.print(current.element + " ");
                current = current.next;
            }
        }
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean contains(E e) {
        Node<E> current = head;
        boolean wtv = false;
        for (int i=1; i<size; i++) {
            if (current.element.equals(e)) {
                wtv = true;
                break;
            }
            else {
                wtv = false;
            }
        }
        return wtv;
    }
    
    public void replace(E e, E newE) {
        Node<E> current = head;
        for (int i=1; i<size; i++) {
            if (current.element.equals(e)) {
                current.element = newE;
                break;
            }
        }
    }
    
}
