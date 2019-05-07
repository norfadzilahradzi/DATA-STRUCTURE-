
package Q2;

import java.util.LinkedList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string : ");
        String word = s.next();
        
        Palindrome<Character> q = new Palindrome<>();
        
        for (int i=word.length()-1; i>=0; i--) {
            q.enqueue(word.charAt(i));
        }
        
        String reverseString = "";
        
        while (!q.isEmpty()) {
            reverseString = reverseString + q.dequeue();
        }
        if (word.equals(reverseString)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    
}
