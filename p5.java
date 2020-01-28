import javaLab.rectangle;

import java.util.Scanner;

public class p5{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        Scanner inp = new Scanner(System.in);
        int l = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("Area of Rectangle: "+r.Rarea(l,b));
        int s = inp.nextInt();
        System.out.println("Area of Square: "+r.Rarea(s));
        inp.close();
    }
}