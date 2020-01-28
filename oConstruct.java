import javaLab.student;
import java.util.Scanner;

public class oConstruct{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        student s1 = new student();
        String n = inp.nextLine();
        String u = inp.nextLine();
        int a = inp.nextInt();
        student s2 = new student(u,n,a);
        student s3 = new student(s2);
        System.out.println("No Parameter");
        s1.printDetails();
        System.out.println("Parameterized");
        s2.printDetails();
        System.out.println("Copy");
        s3.printDetails();
        inp.close();
    }
}