package javaLab;

class book{
    String title, author;
    int pages;
    book(String t, String a, int p){
        title = t;
        author = a;
        pages = p;
    }
    void getDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
    }

}