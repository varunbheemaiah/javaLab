package javaLab;

public class bank_a extends bank{
    int bal_a;
    public bank_a(){
        bal_a = 1000;
    }
    public void getBalance(){
        System.out.println("Bank_A Balance: "+bal_a);
    }
}