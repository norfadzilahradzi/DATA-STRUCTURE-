
package Q5;

public class Circle<E> {
    private E radius;

    public Circle(E radius) {
        this.radius = radius;
    }
    
    public static <E extends Comparable<E>> String max(E[] list) {
        E max = list[0];
        
        for (int i=0; i<list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max =  list[i];
            }
        }
        return max + " ";
    }
    
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {3, 2.9, 5.9};
        
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
        
    }
}
