package com.pcschool.ocp.test;

import java.util.Scanner;



public class Bmi2 {
    public static void main(String[] args) {
        System.out.println("Hello Bmi");
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入身高:");
        double h=sc.nextDouble();
        System.out.println("請輸入體重:");
        double w=sc.nextDouble();
        double bmi=w/Math.pow(h/100, 2);
        System.out.printf("身高:%.1f 體重:%.1f Bmi:%.2f",h,w,bmi);

    }
 
}