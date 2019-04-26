
package Q4;

public class CheckPalindrome<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public void push(E e) {
        list.add(e);
    }
    
    public E peek() {
        return list.get(getSize() - 1);
    }
    
    public int getSize() {
        return list.size();
    }
    
    public E pop() {
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return e;
    }
    
    public boolean isEmpty() {
        boolean ans = true;
        if (list.isEmpty() == true) {
            ans = true;
        }
        else {
            ans = false;
        }
        return ans;
    }
    
    public String toString() {
        return "total";
    }
}
