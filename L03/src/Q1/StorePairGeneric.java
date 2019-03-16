
package Q1;

public class StorePairGeneric<E> {
    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    
    public void setPair(E first, E second) {
        this.first = first;
        this.second = second; 
    }
    
    //OVERIDE THE OBJECT EQUALS() METHOD TO COMPARE THE FIRST VALUES OF 
    //TWO OBJECTS FOR EQUALITY
    public boolean equals(Object a) {
        
    }
    
    
    public String toString() {
        return "first = " + this.first + " second = " + this.second;
    }
}
