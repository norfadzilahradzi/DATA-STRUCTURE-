
package Q2;

public class Palindrome<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    
    public void enqueue (E e) {
        list.addLast(e);
    }
    
    public E dequeue () {
        return list.removeFirst();
    }
    
    public boolean isEmpty () {
        if (list.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
