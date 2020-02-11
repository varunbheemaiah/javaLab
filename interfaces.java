import javaLab.hex;
import javaLab.bin;
import javaLab.oct;
import javax.swing.JOptionPane;
/**
 * interfaces
 */
public class interfaces {
    public static void main(String[] args) {
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Value"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Value"));
        bin b = new bin(v1, v2);
        oct o = new oct(v1, v2);
        hex h = new hex(v1, v2);
        String ans = "Binary Addition: "+b.add() + "\nOctal Addition: "+o.add() + "\nHexadecimal Addition: "+h.add();
        JOptionPane.showMessageDialog(null, ans);
    }
}