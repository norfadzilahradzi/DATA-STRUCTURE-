
public class TestLinkedList<E> {
    
    public static void main(String[] args){
        
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        
        list.print();
        list.reverse();
        list.size();
        list.getFirst();
        list.getLast();
        //DELETE THE MIDDLE VALUE
        list.get(1); //2nd
        list.get(2); //3rd
        //CHECK IF THE LIST HAS VALUE 'C'
        //REPLACE THE ITEMS WITH H,E,L,L,0
        
        
    }
    
}
