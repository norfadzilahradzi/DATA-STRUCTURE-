
import java.util.Scanner;


public class T203 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Before : ");
        String word = s.next();
        System.out.print("After: ");
        System.out.println(reverse(word));   
    }
    
    public static String reverse (String sentence) {
        if (sentence.length() == 0) {
            return sentence; 
        }
        else {
            return reverse(sentence.substring(1)) + sentence.charAt(0);
        }
    }
    
}
