
package Q5Q6;

public class Duo<A,B> {
    private A first;
    private B second;

    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }
    
    public static void main(String[] args) {
        //ARRAYLIST OBJECT
        Duo<String, Integer> sideShape = new Duo<>("Fadzilah", 20);
        Duo<Double, Double> points = new Duo<>(20.10, 1999.0);
    }
}
