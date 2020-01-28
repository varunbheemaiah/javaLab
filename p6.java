import javaLab.arithmetic;
import java.util.Scanner;

public class p6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        arithmetic a = new arithmetic();
        int num = s.nextInt();
        System.out.println("Square: "+a.square(num));
        s.close();
    }
}