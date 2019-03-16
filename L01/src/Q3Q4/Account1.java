
package Q3Q4;

import java.util.ArrayList;

public class Account1 extends Account {
    private String name;
    private ArrayList transactions;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
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
        
    public double getMonthlyInterest() {
        //RETURN MONTHLY INTEREST
        return balance*getMonthlyInterestRate();
    }
    
    public double getMonthlyInterestRate() {
        return (this.annualInterestRate/100)/12;
    }
    
    public void withdraw() {
        int[] withdraw = {5,4,2};
        for (int i=0; i<withdraw.length; i++) {
            balance = balance - withdraw[i];
        }
    }
    
    public void deposit() {
        int[] deposit = {30, 40, 50};
        for (int i=0; i<deposit.length; i++) {
            balance = balance + deposit[i];
        }
    }
    
    public String toString() {
        return "Account holder name : " + name + "\n" +
                "Interest rate : " + getMonthlyInterest() + "\n" +
                "Balance : " + getBalance();
    }
}
