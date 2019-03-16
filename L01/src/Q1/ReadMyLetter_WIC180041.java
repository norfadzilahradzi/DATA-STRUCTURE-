
package Q1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_WIC180041 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileInputStream("Norfadzilah_WIC180041.txt"));
            PrintWriter p = new PrintWriter(new FileOutputStream("Norfadzilah_WIC180041.txt", true));
            while (s.hasNext()) {
                String word = s.nextLine();
                System.out.println(word + " ");
            }
           
           p.println();
           p.println();
           p.println("Thursday, 10 May 2018");
           p.println();
           p.println("It's me again. Finally, it's the end of the term and the DS class has finished !\n");
           p.println("I think I did a very good performance in DS. I am very happy with my performance as it go well beyond my expectation.\n");
           p.println();
           p.println("There are so many things that DS has taught me such as to start planning my code first before writing it. By doing this, I finally"
                   + "can code without a very serious problem like stuck in the middle etc.\n");
           p.println("I think I should stick to my previous target which is A. Even if I do not get it, I don't think I will regret as I have done my best.\n");
           p.println("What I did well during this course is I managed to finish all my tutorials and labs questions by my owns.\n");
           p.println("For this course to be better, I think they should open an additional class for those who really need it in the future.\n");
           
           s.close();
           p.close();
           
        }
        catch (Exception e) {
            System.out.println("File not found");            
        }
    
    }
    
}
