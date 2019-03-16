
package Q1;

public class Container<T> {
    private T t;

    //NO T IS REQUIRE
    private Container() {
    }
    
    public void add (T t) {
        this.t = t;
    }
    
    public T retrieve() {
        return t;
    }
    
    public static void main(String[] args) {
        
        //GENERIC METHOD
        Container<Integer> a = new Container<Integer>();
        Container<String> b = new Container<String>();
        
        a.add(new Integer(50));
        b.add(new String ("Java"));
        
        System.out.println(a.retrieve());
        System.out.println(b.retrieve());
    }
    
}
