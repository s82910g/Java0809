package com.pcschool.ocp.d04;


public class Pen {
    private int price;

    public Pen() {
         this(0);
    }

    @Override
    public String toString() {
        return "Pen{" + "price=" + price + '}';
    }

    public Pen(int price) {
        if(price<10)
             this.price = price;
        else
             this.price = price;

    }
}
