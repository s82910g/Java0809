package com.pcschool.ocp.d03.Fastfood;


public class Breast {
   private int price=95;
   private static int amount=100;

    public Breast() {
        amount--;
    }
   
    public int getPrice() {
        return price;
    }

    public static int getAmount() {
        return amount;
    }
    
}
