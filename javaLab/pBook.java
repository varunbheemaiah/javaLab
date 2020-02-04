package javaLab;

public class pBook extends book{
    int numCopies;
    double bP, sP;
    public pBook(String t, String a, int p, int n, double b){
        super(t, a, p);
        bP = b;
        numCopies = n;
    }
    public void setSp(){
        sP = 1.05*bP;
    }
    public void buy(){
        numCopies--;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Number of Copies: "+numCopies);
        System.out.println("Base Price: "+bP);
        System.out.println("Selling Price: "+sP);
    }
}