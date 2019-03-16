
import java.util.Scanner;


public class T204 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Integer N : ");
        int num = s.nextInt();
        System.out.print("After : ");
        System.out.print(calc(num) + " ");
    }
    
    public static int calc(int a) {
        if (a == 0) {
            return 0;
        }
        else if (a == 1) {
            return 1;
        }
        else {
;            return a + calc(a-1);
        }
        
    }
    
}
 