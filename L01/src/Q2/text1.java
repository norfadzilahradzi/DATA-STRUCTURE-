
package Q2;

import java.io.FileInputStream;
import java.util.Scanner;

public class text1 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner (new FileInputStream("text1.txt"));
            int totalLower = 0, totalUpper = 0;
            while (s.hasNext()) {
                String word = s.next();
               
                for (int i=0; i<word.length(); i++) {
                    if (Character.isLowerCase(word.charAt(i))) {
                        totalLower++;
                        System.out.print(word.charAt(i));
                    }
                    if (Character.isUpperCase(word.charAt(i))) {
                        totalUpper++;
                        System.out.println(word.charAt(i));
                } 
            }
            }
            System.out.println();
            System.out.println("\nTotal characters : " + (totalLower + totalUpper));
        }   
        
        catch (Exception e) {
            System.out.println("File not founf");
        }
    }
    
}
