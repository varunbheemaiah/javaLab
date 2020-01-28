import javaLab.labFuncs;


import javax.swing.*;

public class p1c{
    static labFuncs F = new labFuncs();
    static JFrame frame = new JFrame();
    public static void main(String[] args){
        double far = Double.parseDouble(JOptionPane.showInputDialog("Enter Farenheit"));
        JOptionPane.showMessageDialog(frame, F.farToCel(far)+" degree Celsius");
    }
}
