
import java.util.Scanner;


public class T205 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number : ");
        int num = s.nextInt();
        System.out.print("Number with space : ");
        printDigit(num);
    }
    
    public static void printDigit(int a) {
        if (a <= 9 && a>= 0) {
            System.out.print(a + " ");
        }
        else {
            printDigit(a/10);
            System.out.print(a%10 + " ");
        }
    }
    
}
