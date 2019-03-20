
public class TestLinkedList<E> {
    
    public static void main(String[] args){
        
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        
        System.out.println("All elements : ");
        list.print();
        
        System.out.println("Reverse elements : ");
        list.reverse();
        
        System.out.println("Size : ");
        list.size();
        
        System.out.println("First element : ");
        list.getFirst();
        
        System.out.println("Last element : ");
        list.getLast();
        
        System.out.println("Deleted : ");
        list.remove(2); //DELETE THE MIDDLE VALUE
        
        System.out.println("Location 2nd value : ");
        list.get(1); //2nd
        
        System.out.println("Location 3rd value : ");
        list.get(2); //3rd
        
        list.contains('c');
        //CHECK IF THE LIST HAS VALUE 'C'
        
        
        //REPLACE THE ITEMS WITH H,E,L,L,0
        
        
    }
    
}
