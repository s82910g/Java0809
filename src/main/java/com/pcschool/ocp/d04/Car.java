package com.pcschool.ocp.d04;

public class Car {

    private static String brandName = "Toyota";
    private String typeName;//車款

    public void printCar() {
        System.out.println(brandName);
        System.out.println(typeName);
    }

    public static void printCar2() {
        System.out.println(brandName);
        //  System.out.println(typeName);
    }

    public static void printCar3() {
        System.out.println(brandName);
        Car car = new Car();
        System.out.println(car.typeName);
    }

}
