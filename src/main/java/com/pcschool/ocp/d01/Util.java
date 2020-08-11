package com.pcschool.ocp.d01;


public class Util {
    public double[]values;
    
    public double getSums(){
        double sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }
    
    public double getAvg(){
        double avg=getSums()/values.length;
        return avg;
    }
    
    public double getSD(){
        double sum=0;
        for(int i=0;i<values.length;i++){
            sum+=Math.pow(values[i]-getAvg(),2);
         }
          double sd=Math.sqrt((1.0/values.length)* getSums());
          return sd;
    }
    
    public double getCV(){
        double cv=getSD()/getAvg();
        return cv;
    }
    
}
