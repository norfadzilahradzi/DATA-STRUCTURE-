
package Q2;

import java.io.FileInputStream;
import java.util.Scanner;

public class text2 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner (new FileInputStream("text2.txt"));
            int totalNum = 0;
            while (s.hasNext()) {
                String word = s.next();
                
                for (int i=0; i<word.length(); i++) {
                    if (Character.isDigit(word.charAt(i))) {
                        totalNum++;
                    }
                }
            }
            System.out.println("Total numbers : " + totalNum);
             System.out.println("All numbers : ");
            
        }        
        catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
}
