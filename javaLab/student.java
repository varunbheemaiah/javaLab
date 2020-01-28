package javaLab;

public class student{
    String usn, name;
    int age;
    public student(){}
    public student(String u, String n, int a){
        usn = u;
        name = n;
        age = a;
    }
    public student(student s){
        usn = s.usn;
        name = s.name;
        age = s.age;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("Age: "+age);
    }
}