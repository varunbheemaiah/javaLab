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
}