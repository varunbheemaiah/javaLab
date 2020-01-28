import javaLab.area;
import javaLab.trapezium;
import java.util.Scanner;


public class p4 {
    public static void main(String[] args) {
        area a = new area();
        trapezium t = new trapezium();
        Scanner i = new Scanner(System.in);
        System.out.println("Rectangle");
        int l = i.nextInt();
        int b = i.nextInt();
        System.out.println("Area: "+a.Rarea(l, b));
        System.out.println("Square");
        int s = i.nextInt();
        System.out.println("Area: "+a.Rarea(s));
        System.out.println("Circle");
        float r = i.nextFloat();
        System.out.println("Area: "+a.Carea(r));
        System.out.println("Triangle");
        b = i.nextInt();
        int h = i.nextInt();
        System.out.println("Area: "+a.Tarea(b, h));
        System.out.println("Trapezium");
        float p1 = i.nextFloat();
        float p2 = i.nextFloat();
        float he = i.nextFloat();
        System.out.println("Area: "+t.Tarea(p1, p2, he));
        i.close();
    }
}