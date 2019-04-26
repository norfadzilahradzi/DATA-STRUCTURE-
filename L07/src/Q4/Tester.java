
package Q4;

import java.util.Scanner;
import java.util.Stack;

public class Tester {

     public static void main(String[] args) {

        Stack<Character> stack = new Stack<Character>();
         
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input : ");
        String input = s.next();
        if (input.length() > 15) {
            System.out.print("Enter input again : ");
            input = s.next();
        }
        
        
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput = reverseInput + stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
    
}
