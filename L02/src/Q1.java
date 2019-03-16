
import java.util.Scanner;


public class Q1 {
    
//      Create a recursive function that accepts a String parameter, and substitute any of the lowercase “a” (no applicable for uppercase "A") found with “i” char. Example:
//	substituteAI ("flabbergasted ") ? "flibbergisted "
//	substituteAI ("Astronaut ") ? " Astroniut"    


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word;
        do {
            System.out.print("substituteAI : ");
            word = s.next();
            System.out.println(" => " + subs(word));
            
        }
        while (!(word.equals("stop")));
    }
    
    public static String subs (String a) {
        if (a.length() == 0) {
            return a;
        }
        else if (a.charAt(0) == 'a') {
            return "i" + subs(a.substring(1));            
        }
        else {
            return a.charAt(0) + subs(a.substring(1));
        }
    }
//    Example word = Ila
//            I will be charAt(0)
//            when print l be charAt(1)
//            next, l will be charAt(0)
    
    }
    

