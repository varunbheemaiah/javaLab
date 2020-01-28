package javaLab;

public class labFuncs{
    public int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public void printPrimes(int n){
        int flag = 0, i, j;
        System.out.println(2);
        for(i=3;i<=n;i++){
            flag = 0;
            for(j=2;j<=i/2;j++){
                if(i%j == 0){
                    flag = 1;
                    // break;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
        }
    }
    public double farToCel(double F){
        return (F-32)*0.5556;
    }
    public void print(int a, char b){
        System.out.println("Int and Char");
        System.out.println(a+" "+b);
    }
    public void print(char a, int b){
        System.out.println("Char and Int");
        System.out.println(a+" "+b);
    }
}