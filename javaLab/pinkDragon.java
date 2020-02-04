package javaLab;

public class pinkDragon extends dragon{
    static int maxGroundRiders = 6;
    public pinkDragon(){
        super("Pink", "Large", false, 10, 0);
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Transport");
    }
}