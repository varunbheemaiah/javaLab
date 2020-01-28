import javaLab.labFuncs;


import javax.swing.*;

public class p1b{
    static labFuncs F = new labFuncs();
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        F.printPrimes(n);
    }
}