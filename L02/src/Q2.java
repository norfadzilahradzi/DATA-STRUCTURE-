
import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word2 = "";
        System.out.print("Word : ");
        String word = s.next();
        System.out.println(permuteString(word, word2));
    }
    
    public static String permuteString(String a, String b) {
        if (a.length() == 0) {
            return a;
        }
        else {
            for (int i=0; i<a.length(); i++) {
                return permuteString(b + a.charAt(i), a.substring(0,i) + a.substring(i+1, a.length()));
            }
        }
        return null;
    
    }
    
}
