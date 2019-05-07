
package Q3;

public class Queue<E> {
    private java.util.LinkedList list = new java.util.LinkedList<>();

    public Queue() {
    }
    
    public void enqueueShare (E e) {
        list.add(e);
        
    }
    
    public void dequeueShare () {
        list.removeFirst();
    }
    
    public void enqueuePrice (E e) {
        list.add(e);
    }
    
    public void dequeuePrice () {
        list.removeFirst();    
    }
    
    public String toString() {
        return "Queue : " + list.toString();
    }
}
