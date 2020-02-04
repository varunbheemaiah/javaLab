package javaLab;

public class eBook extends book{
    double eBookSize;
    String format;
    public eBook(String t, String a, int p, String f){
        super(t, a, p);
        format = f;
    }
    public void setSize(double s){
        eBookSize = s;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Size: "+eBookSize+" MB");
        System.out.println("Format: "+format);
    }
}