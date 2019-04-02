
package Q3;

public class Tester<E> {

    public static void main(String[] args) {
        
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        
        list.addFirst("1");
        list.addLast("10");
        list.addLast("100");
        list.add(2, "2");
        list.remove(3);
        
        System.out.println();
        list.tranverseForward();
        
        System.out.println();
        list.tranverseBackward();
        
        System.out.print("\n\nsize of current Doubly Linked List: ");
        System.out.println(list.printSize());
        
        list.clear();
        System.out.println("\nsuccessfully clear 3 node{s)");
        
        System.out.print("\nsize of current Doubly Linked List: ");
        System.out.println(list.printSize());
       
                
                
        
        
    }
    
}
