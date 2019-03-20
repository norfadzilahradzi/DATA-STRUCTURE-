
public class MyLinkedList<E> implements BagInterface<E> {
    private int size;
    Node<E> head = null;
    Node<E> tail = null;

    public MyLinkedList() {
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        head = newNode;
        size++;
        
        if (tail == null) {
            tail = head;
        }
    }

    @Override
    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0 || size == 0) {
            addFirst(e);
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

    @Override
    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    @Override
    public E removeLast() {
        if (size == 0) {
            return null;
        }
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;     //RESET TO KNOW
            size = 0;
            return temp.element;    //TO KNOW WHAT WE DELETE
        }
        else {
            Node<E> current = head;
            for (int i=0; i<size-2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous= head;
            for (int i=1; i<index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    @Override
    public void add(E e) {
        addLast(e);
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        for (int i=0; i<size; i++) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public E getLast() {
        return tail.element;
    }

    @Override
    public int indexOf(E e) {

    }

    @Override
    public int lastIndexOf(E e) {

    }

    @Override
    public E set(int index, E e) {
        Node<E> current = head;
        if (index == 0 || index >= size) {
            return null;
        }
        else {
            for (int i=0; i<index; i++) {
                current = current.next;
            }
        }
        return (E) current;
        
    }

    @Override
    public void clear() {
        Node<E> temp = head;
        for (int i=1; i<size; i++) {
            head = head.next;
            temp = null;
        }
    }
    //while (size != 0) {
    //removeFirst();

    @Override
    public void print() {
        if (size == 0) {
            System.out.println("The list is empty.");
        }
        else {
            for (int i=0; i<size; i++) {
                Node<E> current = head;
                System.out.print(current.element + " ");
            }
        }
    }

    @Override
    public void reverse() {
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }

    }
    
    public int size() {
        return size;
    }
    
    public E getMiddleValue() {
        
            Node<E> current = head;
            Node<E> middle = head;
            int length = 0;
            
            while (current.next != null) {
                length++;
                if (length%2 == 0) {
                    middle = middle.next;
                }
                current = current.next;
                
                if (length%2 == 1) {
                    middle = middle.next;
                }
            }
            return (E) middle;
        }
    
}
