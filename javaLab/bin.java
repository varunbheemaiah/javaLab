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
}