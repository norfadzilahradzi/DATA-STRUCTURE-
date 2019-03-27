
public class MyLinkedList<E> implements BagInterface<E> {
    private int size;
    Node<E> head;
    Node<E> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
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
        boolean wtv = false;
        for (int i=1; i<size; i++) {
            current = current.next;
            if (current.element.equals(e)) {
                wtv = true;
            }
            else {
                wtv = false;
            }
        }
        return wtv;
    }

    @Override
    public E get(int index) {
        Node<E> current = head;
        if (index < 0 || index >= size) {
            return null;
        }
        for (int i=0; i<index; i++) {
            current = current.next;
        }
        return current.element;
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
        Node<E> current = head;
        int index = 0;
        if (size == 0) {
            return -1;
        }
        if (current.element.equals(e)) {
            return index;
        }
        for (int i=0; i<size-1; i++) {
            current = current.next;
            index++;
            if (current.element.equals(e)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int index = 0, result = -1;
        if (size == 0) {
            return -1;
        }
        if (current.element.equals(e)) {
            return index;
        }
        for (int i=0; i<size-1; i++) {
            current = current.next;
            index++;
            if (current.element.equals(e)) {
                result = index;
            }
        }
        return result;
    }

    @Override
    public E set(int index, E e) {
        Node<E> current = head;
        if (index == 0) {
            return null;
        }
        else {
            for (int i=0; i<index; i++) {
                current = current.next;
            }
            E temp = tail.element;
            current.element = e;
            return temp;
        }
        
    }

    @Override
    public void clear() {
        for (int i=1; i<size; i++) {
            while (size != 0) {
                removeFirst();
            }
        }
    }

    @Override
    public void print() {
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

//    @Override
//    public E reverse() {
//        if (size == 0) {
//            System.out.println("Nothing to reverse.");
//        }
//        else {
//          Node<E> current = head;
//          Node<E> prev = null;
//          Node<E> next = null;
//          
//          while (current != null) {
//              next = current.next;
//              current.next = prev;
//              prev = current;
//              current = next;
//          }
//          return (E) prev;
//        }
//    }
    
    public int size() {
        return size;
    }
    
    public E getMiddleValue() {
        if (size == 0) {
            return null;
        }
        else {
            int index = size / 2;
            return this.get(index);
        }
    }
    
}
