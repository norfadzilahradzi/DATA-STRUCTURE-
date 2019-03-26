
package Q3;

public class DoublyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void addLast(E element) {
        Node<E> tmp = new Node(element, null, tail);
        if (tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        
        if (head == null) {
            head = tmp;
        }
        size++;
        System.out.println("Adding : " + element);
    }
    
    public void add(int index, E e) {
        if (index == 0 || size == 0) {
//            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        } 
        else {
            Node<E> current = head;
            for (int i=1; i<index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    public void add(E e) {
        addLast(e);
    }
    
    public static void main(String[] args) {
        
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        
        list.addLast("d");
    }
    
    
    
}
