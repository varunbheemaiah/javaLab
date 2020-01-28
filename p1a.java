import javaLab.labFuncs;

import javax.swing.*;

public class p1a{
    static labFuncs F = new labFuncs();
    static JFrame frame = new JFrame();
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        JOptionPane.showMessageDialog(frame,"The Factorial of "+n+" is "+F.fact(n));
    }
}