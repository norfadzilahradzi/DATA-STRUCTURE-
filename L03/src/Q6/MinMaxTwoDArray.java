
package Q6;

public class MinMaxTwoDArray<E> {
    
    public static <E extends Comparable<E>> E min (E[][] list) {
        E min = list[0][0];
        
        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[i].length; j++) {
                if (list[i][j].compareTo(min) < 0) {
                    min = list[i][j];
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max (E[][] list) {
        E max = list[0][0];
        
        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }
    
    public static void main (String[] args) {
        Integer[][] number = {{4,5,6},{1,2,3}};
        System.out.println("Maximum element : " + max(number));
        System.out.println("Minimum element : " + min(number));
    }
}
