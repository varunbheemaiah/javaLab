package javaLab;

public class rainbowDragon extends dragon{
    static int maxGroundRiders = 2;
    static int maxFlightRiders = 1;
    public rainbowDragon(){
        super("Rainbow", "Medium", true, 20, 50);
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Transport");
    }
}