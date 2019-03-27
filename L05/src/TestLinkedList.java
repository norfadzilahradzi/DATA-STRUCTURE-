
public class TestLinkedList<E> {
    
    public static void main(String[] args){
        
        MyLinkedList<String> list = new MyLinkedList<>();
                
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
               
        System.out.print("All elements : ");
        list.print();
        
//        System.out.print("\nReverse elements : ");
//        list.reverse();
        
        System.out.println("\nSize : " + list.size());
        
        System.out.println("First element : " + list.getFirst());
        
        System.out.println("Last element : " + list.getLast());
        
        System.out.println("\nAFTER ONE ELEMENT DELETED");
        list.remove(2); //DELETE THE MIDDLE VALUE
        System.out.print("Elements left : ");
        list.print();
        System.out.println();
        
        System.out.println("Location 2nd value : " + list.get(1));
        System.out.println("Location 3rd value : " + list.get(2));
        
        System.out.println("Is the list has c ? " + list.contains("c"));

//        list.clear();
//        list.print();
        
        list.set(0, "h");
        list.set(1, "e");
        list.set(2, "l");
        list.set(3, "l");
//        list.set(4, "o");
        
        list.print();
        System.out.println();
        
    }
    
}
