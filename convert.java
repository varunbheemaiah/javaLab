import javaLab.hex;
import javaLab.bin;
import javaLab.oct;
/**
 * convert
 */
public class convert {
    public static void main(String[] args) {
        hex h = new hex(10, 20);
        System.out.println(h.convert("af"));
        System.out.println(Character.getNumericValue(','));
    }
}