package com.pcschool.ocp.d04;


public class ConstructorDemo4 {
    public static void main(String[] args) {
        BMI b1=new BMI();
        BMI b2=new BMI(180,180);
        BMI b3=new BMI(-60,-170);
        BMI b4=new BMI(180,70);
        BMI b5=new BMI(190);
        BMI b6=new BMI(240);
       
        
       
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        
    }
}
