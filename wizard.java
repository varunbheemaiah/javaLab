import javaLab.pinkDragon;
import javaLab.blueDragon;
import javaLab.rainbowDragon;

/**
 * wizard
 */
public class wizard {

    public static void main(String[] args) {
        pinkDragon pD = new pinkDragon();
        blueDragon bD = new blueDragon();
        rainbowDragon rD = new rainbowDragon();
        pD.getDetails();
        bD.getDetails();
        rD.getDetails();
    }
}

