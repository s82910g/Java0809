package com.pcschool.ocp.d04;


public class BMI {
    private double h=170;//100~250CM(170.0)
    private double w=60;//30~150KG(60.0)
    
    public BMI() {
    }

   
        
            
        
    public BMI(double h) {
        if(h >= 100 && h <= 250){
            this.h = h;
        }
       // this(h);
        //this(w);
    }
      public BMI(double h, double w) {
      /*  if(h >= 100 && h <= 250){
            this.h = h;
        }*/
      this(h);
       if(w >= 30 && w <= 150){
            this.w = w;
        }
       
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + '}';
    }

}