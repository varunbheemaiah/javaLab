package javaLab;

public class blueDragon extends dragon{
    public blueDragon(){
        super("Blue", "Small", true, 2, 100);
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Courier");
    }
}