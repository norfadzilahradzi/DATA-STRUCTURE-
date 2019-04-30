
package Q1;

public class Tester {

    public static void main(String[] args) {
        MyQueue<String> q = new MyQueue<>();
        MyQueue<String[]> fruitQ= new MyQueue<String[]>();
        String[] ini = {"Durian", "Blueberry"};
        fruitQ.enqueue(ini);
        System.out.println(fruitQ.toString());
        
        q.enqueue("Apple");
        q.enqueue("Orange");
        q.enqueue("Grapes");
        q.enqueue("Cherry");
        
        System.out.println(q.toString());
        System.out.println("Top item: " + q.peek());
        System.out.println("Size: " + q.getSize());
        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Item at index 2: ");
        System.out.println(q.toString());
        System.out.println("Empty? " + q.isEmpty());
    }
    
}
