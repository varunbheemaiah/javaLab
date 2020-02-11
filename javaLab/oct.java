package javaLab;

/**
 * oct
 */
public class oct extends number implements addInt{
    public oct(int a,int b){
        super(a, b);
    }
    public String add(){
        int a = v1+v2;
        return Integer.toOctalString(a);
    }
    public int convert(String a){
        int sum = 0 ,j=0;
        for(int i=a.length()-1;i>=0;i--){
            sum += Character.getNumericValue(a.charAt(i)) * Math.pow(8,j);
            j++;
        }
        return sum;
    }
}