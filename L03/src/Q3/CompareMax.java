
package Q3;

public class CompareMax {
    
    public static <E extends Comparable<E>> E maxNum (E a, E b, E c){
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(maxNum(12, 11, 9));
    }
}
