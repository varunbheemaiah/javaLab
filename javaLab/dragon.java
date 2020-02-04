package javaLab;

class dragon{
    String species, size;
    boolean flight;
    int groundSpeed, flightSpeed;
    dragon(String sp, String si, boolean fl, int gS, int fS){
        species = sp;
        size = si;
        flight = fl;
        groundSpeed = gS;
        flightSpeed = fS;
    }
    void getDetails(){
        System.out.println("Species: "+species);
        System.out.println("Size: "+size);
        System.out.println("Flight: "+flight);
        System.out.println("Ground Speed: "+groundSpeed);
        System.out.println("Flight Speed: "+flightSpeed);
    }
}