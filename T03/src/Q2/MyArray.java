
package Q2;

public class MyArray<T> {
    
    public static void main(String[] args) {
        Integer [] numbers = {1, 2, 3, 4, 5};
        String [] names = {"Jane", "Tom", "Bob"};
        Character [] alphabet = { 'a', 'b', 'c'};
        
        MyArray.<Integer>listAll(numbers);
        MyArray.<String>listAll(names);
        MyArray.<Character>listAll(alphabet);
    }
    
    public static <T> void listAll (T[] list) {
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

