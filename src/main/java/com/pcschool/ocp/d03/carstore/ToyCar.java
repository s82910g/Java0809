package com.pcschool.ocp.d03.carstore;

public class ToyCar {
    Wheel wheel ;
    Tire[] tires;
    Engine engine;
    private int price;
    public int getPrice(){
        int tiresTotalPrice=0;
        for(Tire tire:tires){
            tiresTotalPrice+=tire.price;}
                    
        return wheel.price+ engine.price +tiresTotalPrice;
    }
    public int getEnginePrice(){
    
        return engine.price;
    }
}
