import javaLab.eBook;
import javaLab.pBook;
import java.util.Scanner;

public class inherit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 1;
        while(c != 0){
            System.out.println("\n");
            System.out.println("Welcome to the book Management System");
            System.out.println("Enter the Name: ");
            String name = s.nextLine();
            System.out.println("Enter the Author: ");
            String author = s.nextLine();
            System.out.println("Enter the number of Pages");
            int pages = s.nextInt(); 
            System.out.println("Enter the Choice");
            System.out.println("1. EBook");
            System.out.println("2. Printed Book");
            System.out.println("0. Exit");
            c = s.nextInt();
            if(c == 1){
                System.out.println("Enter the book format");
                s.nextLine();
                String format = s.nextLine();
                System.out.println("Enter the book size");
                double size = s.nextDouble();
                s.nextLine();
                eBook eB = new eBook(name, author, pages , format);
                eB.setSize(size);
                System.out.println("Book Details");
                eB.getDetails();
            }
            else if(c == 2){
                System.out.println("Enter Number of Copies");
                int n = s.nextInt();
                System.out.println("Enter Base Price");
                double b = s.nextDouble();
                pBook pB = new pBook(name, author, pages, n, b);
                pB.setSp();
                System.out.println("Buy a book? 0-No, 1-Yes");
                c = s.nextInt();
                if(c == 1){
                    pB.buy();
                }
                pB.getDetails();
            }
            System.out.println("Enter 0 to quit and any number to continue");
            c = s.nextInt();
            s.nextLine();
        }
    }
}