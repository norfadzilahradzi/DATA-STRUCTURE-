
public class Main {

    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        System.out.println("INITIAL ARRAY");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        
        System.out.println();
        selectionSortSmallest(arr);
        System.out.println("ASCENDING ORDER ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        
        System.out.println();
        System.out.println("DESCENDING ORDER");
        selectionSortLargest(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
    
    //ASCENDING
    public static void selectionSortSmallest(int[] arr) {
        //I START 1 SEBAB KITA TAK NAK BANDINGKAN INDEX 1 NGAN 0
        for (int i=1; i<arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for (k=i-1; k>=0 && arr[k] > currentElement; k--) {
                arr[k+1] = arr[k];
            }
            //TUKAR TEMPAT EG; POSITION 45 TUKAR 7
            arr[k+1] = currentElement;
        }
    }
    
    //DESCENDING
    public static void selectionSortLargest(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for (k=i-1; k>=0 && arr[k] < currentElement; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
        }
    }
    
    
    
}
