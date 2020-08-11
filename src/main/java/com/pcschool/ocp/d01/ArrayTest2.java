package com.pcschool.ocp.d01;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[]stocks={7.6,3.9,15.6,28.3,1.2,10.8,35.3,45.6,10.2,0.5};
        double[] bounds={6.8,7.2,6.8,7.5,6.9,7.9,7.9,7.1,7.2};
        Util stocksUtil=new Util();
        stocksUtil.values=stocks;
        
        Util boundsUtil=new Util();
        boundsUtil.values=bounds;
        
        System.out.printf("股票獲利平均%.2f\n",stocksUtil.getAvg());
        System.out.printf("股票獲利變異係數%.2f\n",stocksUtil.getCV());
        System.out.printf("債券獲利平均%.2f\n",boundsUtil.getAvg());
        System.out.printf("債券獲利變異係數%.2f\n",boundsUtil.getCV());
        System.out.printf("CV值最小的是:%s\n",stocksUtil.getCV()<boundsUtil.getCV()?"股票":"債券");
        /*double stockssum=0;
        for(int i=0;i<stocks.length;i++){
            stockssum+=stocks[i];
        }
        double stocksavg=stockssum/stocks.length;
        double stockssum2=0;
        for(int i=0;i<stocks.length;i++){
            stockssum2+=Math.pow(stocks[i]-stocksavg,2 );
        }
        double stockssd=Math.sqrt((1.0/stocks.length)*stockssum2);
        
        double stockscv=stockssd/stocksavg;
        System.out.printf("stocks平均:%.2f\n",stocksavg);
        System.out.printf("stocks變異數:%.2f\n",stockssd);
        System.out.printf("stocks變異係數:%.2f\n",stockscv);

        double boundssum=0;
        for(int i=1;i<bounds.length;i++){
            boundssum+=bounds[i];
        }
        double boundsavg=boundssum/bounds.length;
        double boundssum2=0;
        for(int i=0;i<bounds.length;i++){
            boundssum2+=Math.pow(bounds[i]-boundsavg,2 );
        }
        double boundssd=Math.sqrt((1.0/bounds.length)*boundssum2);
        
        double boundscv=boundssd/boundsavg;
       
        
        
        System.out.printf("bounds平均:%.2f\n",boundsavg);
         System.out.printf("bounds變異數:%.2f\n",boundssd);
        System.out.printf("bounds變異係數:%.2f\n",boundscv);*/
        
        
}
}