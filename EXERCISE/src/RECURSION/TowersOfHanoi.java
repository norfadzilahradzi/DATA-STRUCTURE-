
package RECURSION;

import java.util.Scanner;

public class TowersOfHanoi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int num = s.nextInt();
        
        //Find the solution recursively
        System.out.println("The moves are:");
        moveDisks(num,'A', 'B', 'C');
    }
    
    public static void moveDisks(int num, char fromTower, char toTower, char auxTower ) {
        if (num == 1) {
            System.out.println("Move disk " + num + " from " + 
                fromTower + " to " + toTower);
        }
        else {
            moveDisks(num-1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + num + " from " +
                    fromTower + " to " + toTower);
            moveDisks(num-1, auxTower, toTower, fromTower);
        }
    }
    
}
