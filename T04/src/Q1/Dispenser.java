
package Q1;

public class Dispenser {
    
    private int numberOfItems;  //STORE NUMBER OF ITEMS IN DISPENSERS
    private int cost;           //STORE COST OF AN ITEM

    public Dispenser() {
    }

    public Dispenser(int numberOfItems, int cost) {
        this.numberOfItems = numberOfItems;
        this.cost = cost;
    }
    
    //METHOD TO RETRIEVE NUMBER OF ITEMS
    public int getQuantity() {
        return numberOfItems;
    }
    
    //METHOD TO RETRIEVE THE PODUCT COST
    public int getProductCost() {
        return cost;
    }
    
    //METHOD TO REDUCE THE NUMBER OF ITEMS BY ONE
    public void makeSale() {
        numberOfItems--;
    }
    
    //NEED TO TOPUP THE AMOUNT
    public void isEmpty() {
        
    }
    
    public void setCost() {
        
    }
    
    
    
}
