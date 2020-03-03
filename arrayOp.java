import javaLab.slow;
import javaLab.fast;

/**
 * arrayOp
 */
public class arrayOp {
    public static void main(String[] args) {
        slow s = new slow();
        fast f = new fast();

        int [] arr = {5,1,4,8,7,9,0,2,3,6};
        
        System.out.println("SLOW METHODS");
        s.search(arr, 9);
        s.sort(arr);
        System.out.println();
        System.out.println("FAST METHODS");
        f.search(arr, 9);
        f.sort(arr);
    }    
}