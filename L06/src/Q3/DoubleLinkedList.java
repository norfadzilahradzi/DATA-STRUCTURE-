
package Q3;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoubleLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(E e) {
        Node<E> temp = new Node(e, head, null);
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
        
        if (tail == null) {
            tail = temp;
        }
        size++;
        System.out.println("adding : " + e);
    }
    
    public void addLast(E e) {
        Node<E> temp = new Node(e, null, tail);
        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;
        
        if (head == null) {
            head = temp;
        }
        size++;
        System.out.println("adding: " + e);
    }
    
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        }
        else if (index == size) {
            addLast(e);
        }
        else {
            Node<E> temp = head;
            for (int i=0; i<index; i++) {
                temp = temp.next;
            }
            Node<E> newNode = new Node(e, temp, temp.next);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
        }
    }
    
    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast() {
        if (size == 0) {
            return null;
        }
        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E remove(int index) {
        E e = null;
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            removeFirst();
        }
        else if (index == size-1) {
            removeLast();
        }
        else {
            Node<E> temp = head;
            for (int i=0; i<index; i++) {
                temp = temp.next;
            }
            e = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return e;
    }
    
    public void tranverseForward() {
        System.out.println("iterating forward..");
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
    }
    
    public void tranverseBackward() {
        System.out.println("iterating backward..");
        Node<E> temp = tail;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
    }
    
    public int printSize() {
        if (size == 0) {
            return 0;
        }
        else {
            return size;
        }
    }
    
    public void clear() {
        Node<E> temp = head;
        while (head != null) {
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
    }
    
    
    
    
}
