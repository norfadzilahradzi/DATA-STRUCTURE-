
import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = s.nextInt();
        System.out.print("Enter Y : ");
        int y = s.nextInt();
        System.out.println("X^Y = " + exponent(x, y));
    }
    
    public static long exponent(int x, int m) {
        if (m == 0) {
            return 1;
        }
        else {
            return x * exponent(x, m-1);
        }
        
//        Example 2^2
//        so, 2 * exp(2,1) => 2*2=4
//            2 * exp(2,0) => 2*1=2
    }
    
}
