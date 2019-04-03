
package Q1;

import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
        
        System.out.print("N integer : ");
        int total = s.nextInt();
        System.out.println("Enter values :");
        
        int num[] = new int[total];
        for (int i=0; i<total; i++) {
            num[i] = s.nextInt();
            stack.push(num[i]);
        }
        System.out.println(stack.toString());
        System.out.println("Stack size : " + stack.getSize());
        
        System.out.println();
        for (int i=0; i<total; i++) {
            stack.pop();
            System.out.println(stack.toString());
        }
    }
}                                                                               

