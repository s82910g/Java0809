package com.pcschool.ocp.d04;


public class ConstructorDemo3 {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book(-100);
        Book b3=new Book(300);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
       
    }
}
