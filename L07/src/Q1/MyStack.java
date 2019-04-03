
package Q1;

public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        
    public void push(E e) {
        list.add(e);
    }
    
    public E pop() {
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return e;
    }
    
    public E peek() {
        return list.get(getSize() - 1);
    }
    
    public int getSize() {
        return list.size();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public String toString() {
        return "stack: " + list.toString();
    }
    
    public boolean search (E e) {
        boolean check = true;
        
        for (int i=0; i<getSize(); i++) {
            if (!(peek().equals(e))) {
                check = false;
                pop();
            }
            else {
                check = true;
                break;
            }
        }
        return check;
    }
}
