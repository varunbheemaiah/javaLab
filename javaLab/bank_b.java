package javaLab;

public class bank_b extends bank{
    int bal_b;
    public bank_b(){
        bal_b = 1500;
    }
    public void getBalance(){
        System.out.println("Bank_B Balance: "+bal_b);
    }
}