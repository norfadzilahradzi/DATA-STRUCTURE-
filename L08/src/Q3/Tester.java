
package Q3;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Queue<Integer> q = new Queue<>();
        int i = 0; //SAJE LETAK DULU
        
        do {
        System.out.print("(Buy / sell) : ");
        String buySell = s.next();
        if (buySell.equalsIgnoreCase("buy")) {
            System.out.println("Enter your query (In format 'Buy x shares at $y each') : ");
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println("Buy " + x + " shares at $" + y + " each");
            System.out.println("Buying now...");
            q.enqueueShare(x);
            System.out.print("Queue for Share : " + q.toString());
            q.enqueuePrice(y);
            System.out.print("\nQueue for Price : " + q.toString());
            System.out.println();
        }
        else {
            System.out.println("Enter your query (In format 'Sell x shares at $y each') : ");
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println("Sell " + x + " shares at $" + y + " each");
            System.out.println("Selling the shares now...");
            System.out.println("Total Capital Gain/Loss : ");
            System.out.println("Total Capital Gain/Loss : ");
            q.enqueueShare(x);
            System.out.print("Queue for Share : " + q.toString());
            q.enqueuePrice(y);
            System.out.print("\nQueue for Price : " + q.toString());
            System.out.println();
        }
            System.out.println();
        i++; //SAJE LETAK DULU
        } 
        while (i>0);
        
    }
    
}
