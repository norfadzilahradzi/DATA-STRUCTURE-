
package Q2;

public class Tester {

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("Fadzilah");
        intObj.setE(2010);
        System.out.println("String : " + strObj.getE());
        System.out.println("Integer : " + intObj.getE());
        
    }
    
}
