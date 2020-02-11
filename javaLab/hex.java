package javaLab;

/**
 * hex
 */
public class hex extends number implements addInt{
    public hex(int a, int b){
        super(a, b);
    }
    public String add(){
        int a = v1 + v2;
        return Integer.toHexString(a);
    }
    public int convert(String a){
        int sum = 0, j=0;
        for(int i=a.length()-1;i>=0;i--){
            sum += Character.getNumericValue(a.charAt(i)) * Math.pow(16,j);
            j++;
        }
        return sum;
    }
}