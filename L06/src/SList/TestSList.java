
package SList;

public class TestSList<E> {

    public static void main(String[] args) {
        
        SList<String> list = new SList<>();
        
        list.appendEnd("easy.");
        list.appendEnd("is,");
        list.appendEnd("Linked list,");
        list.display();
        
        System.out.println("\n\nRemoved : " + list.removeInitial());
        System.out.print("After : ");
        list.display();
//        list.contains("difficult");
        list.clear();
    }
    
}
