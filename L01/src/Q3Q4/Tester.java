
package Q3Q4;

public class Tester {

    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.withdraw(2500);
        a.deposit(3000);
        a.setAnnualInterestRate(4.5);
        
        System.out.println("Balance : " + a.getBalance());
        System.out.println("Monthly Interest : " + a.getMonthlyInterest() );
        System.out.println("Date Created : " + a.getDateCreated());
        
        System.out.println();
        Account1 b = new Account1("George", 1122, 1000);
        b.setAnnualInterestRate(1.5);
        b.deposit();
        b.withdraw();
        System.out.println(b.toString());
    }
    
}
