import javaLab.labFuncs;
import javaLab.oLabFuncs;

import java.util.Scanner;

public class p3{
    public static void main(String[] args){
        labFuncs f = new labFuncs();
        labFuncs of = new oLabFuncs(); 
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        char b = inp.next().charAt(0);
        f.print(a, b);
        f.print(b, a);
        of.print(a, b);
        inp.close();
    }
}