
package Q1;

public class MyQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public MyQueue (E[] e) {
        for (int i=0; i<e.length; i++) {
            list.addLast(e[i]);
        }
    }
    
    public MyQueue (){
    }
    
    public void enqueue (E e) {
        list.addLast(e);
    }
    
    public E dequeue () {
        return list.removeFirst();
    }
    
//    public E getElement (int i){
//        
//    }
    
    public E peek () {
        if (list.size() == 0) {
            return null;
        }
        else {
            return list.peekLast();
        }
    }
    
    public int getSize () {
        return list.size();
    }
    
//    public boolean contains (E e) {
//        for (int i=0; i<list.size(); i++) {
//            
//        }
//    }
    
    public boolean isEmpty () {
        if (list.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return "Queue: " + list.toString();
    }
}
