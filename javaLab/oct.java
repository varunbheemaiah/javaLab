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
}