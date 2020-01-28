package javaLab;

public class bank_c extends bank{
    int bal_c;
    public bank_c(){
        bal_c = 2000;
    }
    public void getBalance(){
        System.out.println("Bank_C Balance: "+bal_c);
    }
}