import javaLab.bank_a;
import javaLab.bank_b;
import javaLab.bank_c;
import javaLab.bank;

public class bankI {
    public static void main(String[] args) {
        bank B = new bank();
        bank Ba = new bank_a();
        bank Bb = new bank_b();
        bank Bc = new bank_c();
        B.getBalance();
        Ba.getBalance();
        Bb.getBalance();
        Bc.getBalance();
    }
}
