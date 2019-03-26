
package Q2;

import java.util.Scanner;

public class Tester<E> {

    public static void main(String[] args) {
        
        MyLinkedList<String> list = new MyLinkedList<>();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String name;
        do {
            name = s.next();
            list.add(name);
            
            
        } while (!(name.equals("n")));
        
        System.out.println("\nYou have entered the following students' name : ");
        System.out.println("\nThe number of students entered is : ");
        System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        System.out.println("\nEnter the existing student name that you want to rename : ");
        System.out.println("\nEnter the new name : ");
        System.out.println("\nThe new student list is : ");
        System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        System.out.println("\nEnter a student to remove : ");
        System.out.println("\nThe number of updated student is : ");
        System.out.println("\nThe updated students list is : ");
        System.out.println("\nAll student data captured complete. Thank you!");
    }
    
}
