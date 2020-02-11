package javaLab;

/**
 * bin
 */
public class bin extends number implements addInt{
    public bin(int a, int b){
        super(a, b);
    }   
    public String add(){
        int a = v1+v2;
        return Integer.toBinaryString(a);
    }
    public int convert(String a){
        int sum = 0, j = 0;
        // System.out.println(a.length());
        for(int i=a.length()-1;i>=0;i--){
            // System.out.println("Char = "+a.charAt(i));
            sum += Character.getNumericValue(a.charAt(i)) * Math.pow(2,j);
            j++;
            // System.out.println("Sum = " + sum);
        }
        return sum;
    }
}