
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
            if (!(name.equals("n"))) {
                list.add(name);
            }
        } while (!(name.equals("n")));
        
        System.out.println("\nYou have entered the following students' name : ");
        list.printList();
        
        System.out.println("\n\nThe number of students entered is : ");
        System.out.println(list.getSize());
        
        System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String rename = s.next();
        char next = rename.charAt(0);
        if (next == 'r' || next == 'R') {
            System.out.println("\nEnter the existing student name that you want to rename : ");
            String wantRename = s.next();
            if (list.contains(wantRename)) {
                System.out.println("\nEnter the new name : ");
                String newName = s.next();
                list.replace(name, newName);
            }
        }
        
        System.out.println("\nThe new student list is : ");
        list.printList();
        
        System.out.println("\n\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        String yesno = s.next();
        char decide = yesno.charAt(0);
        if (decide == 'y' || decide == 'Y') {
            System.out.println("\nEnter a student to remove : ");
            String remove = s.next();
            list.removeElement(remove);
        }
                        
        System.out.println("\nThe number of updated student is : ");
        System.out.println(list.getSize());
        
        System.out.println("\nThe updated students list is : ");
        list.printList();
        
        System.out.println("\n\nAll student data captured complete. Thank you!");
    }
    
}

