
//ARRAY BAG = GENERIC CLASS
//BAG INTERFACE = GENERIC INETERFACE
public class ArrayBag<T> implements BagInterface<T> {
    private final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    private T[] bag;
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        if (numberOfEntries == 25) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (numberOfEntries == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean add(T newEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String union() {
        ArrayBag<String> newBag = new ArrayBag<String>();
        
        for (int i=0; i<numberOfEntries; i++) {
            newBag.add((String) this.toArray()[i]);
        }
    } 

//    @Override
//    public String intersection() {
//        BagInterface<String> commonItems = bag1.intersection(bag2);
//    }
//
//    @Override
//    public String difference() {
//        
//    }

    @Override
    public String intersection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String difference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
