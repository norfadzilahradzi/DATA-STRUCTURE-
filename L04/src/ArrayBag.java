
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
        if (this.isFull()) {
            return false;
        }
        bag[numberOfEntries++] = newEntry;
        return true;
    }

    @Override
    public T remove() {
        if (numberOfEntries > 0) {
            return bag[--numberOfEntries];
        }
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean found = false;
        for (int i=0; i<numberOfEntries; i++) {
            if (bag[i].equals(anEntry)){
                found = true;
                for (int j=i; j<numberOfEntries-1; j++) {
                    bag[j] = bag[j+1];
                }
                numberOfEntries--;
                break;
            }
        }
        if (found) {
            return true; }
        return false;        
    }

    @Override
    public void clear() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for (int i=0; i<numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean contains(T anEntry) {
        for (T temp : bag) {
            if (temp.equals(anEntry)) {
                return true;
            }
        }
        return false;
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

    @Override
    public String intersection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String difference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
