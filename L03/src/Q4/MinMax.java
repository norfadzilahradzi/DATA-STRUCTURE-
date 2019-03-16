
package Q4;

public class MinMax<E> {
    
    public static <E extends Comparable<E>> String minmax(E[] list) {
        E minInt = list[0];
        E maxInt = list[0];
        
        for (int i=0; i<list.length; i++) {
            if (list[i].compareTo(maxInt) > 0) {
                maxInt = list[i];
            }
            if (list[i].compareTo(minInt) < 0 ) {
                minInt = list[i];
            }
        }
        return "Min = " + minInt + "  Max = " + maxInt;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));

    }
}
 