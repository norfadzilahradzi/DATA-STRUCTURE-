
package Q3Q4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        DateFormat dateFormat = new SimpleDateFormat("dd//MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
        
    public double getMonthlyInterest() {
        //RETURN MONTHLY INTEREST
        return balance*getMonthlyInterestRate();
    }
    
    public double getMonthlyInterestRate() {
        return (this.annualInterestRate/100)/12;
    }
    
    public void withdraw(double money) {
        if (money < balance) {
            balance = balance - money;
        }
        else {
            System.out.println("Cannot withdraw money");
        }
    }
    
    public void deposit(double money) {
        balance = balance + money;
    }
}
