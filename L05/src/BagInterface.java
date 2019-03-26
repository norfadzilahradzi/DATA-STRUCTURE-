
public interface BagInterface<E> {
    
    public void addFirst(E e);
    
    public void addLast (E e);
    
    public void add(int index, E e);
    
    public E removeFirst();
    
    public E removeLast();
    
    public E remove(int index);
    
    /**
     * Return nothing, but adds an element to the list
     * @param e 
     */
    public void add(E e);
    
    /**
     * 
     * @param e
     * @return true if list contains the element e
     */
    public boolean contains(E e);
    
    /**
     * 
     * @param index
     * @return element at the specified index
     */
    public E get(int index);
    
    /**
     * 
     * @return the value of the first item
     */
    public E getFirst();
    
    /**
     * 
     * @return the value in the last item
     */
    public E getLast();
    
    /**
     * 
     * @param e
     * @return the index of the head matching element in this list.
     * Return -1 of no match.
     */
    public int indexOf(E e);
    
    /**
     * 
     * @param e
     * @return Return the index of the last matching element in this list.
     * Return -1 of no match.
     */
    public int lastIndexOf(E e);
    
    /**
     * Replace the element at the specified position in this list with
     * the specified element.
     * @param index
     * @param e
     * @return 
     */
    public E set(int index, E e);
    
    /**
     * Clear the list.
     */
    public void clear();
    
    /**
     * Print all the elements in the list.
     */
    public void print();
    
    /**
     * Print all elements in reverse order.
     */
    public E reverse();
}
