package com.pcschool.ocp.d01;

import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.DoubleSummaryStatistics;

public class ArrayTest3 {
    public static void main(String[] args) {
        double[] h={172,168,164,170,176};
        //Java7
        double sum=0;
        for(int i=0,len=h.length;i<len;i++){
            sum+=h[i];
        }
        double avg=sum/h.length;
        double max=0,min=h[0];
        for(int i=0,len=h.length;i<len;i++){
            if(max<h[i]){
                max=h[i];
            }
            if(min>h[i]){
                min=h[i];
            }
        }
        
        System.out.printf("平均:%.2f cm\n",avg);
        System.out.printf("最大值:%.2f cm 最小值:%.2f cm\n",max,min);
 
        //Java8
        Arrays.stream(h).forEach(y -> System.out.println(y));
        sum=Arrays.stream(h).sum();
        avg=Arrays.stream(h).average().getAsDouble();
        System.out.printf("總身高: %.1f 平均身高: %.1f\n",sum,avg);
        //統計
      DoubleSummaryStatistics stat=  Arrays.stream(h).summaryStatistics();
        System.out.println(stat);
        System.out.printf("數量:%d\n",stat.getCount());
        System.out.printf("平均:%.2f\n",stat.getAverage());
        System.out.printf("總和:%.2f\n",stat.getSum());
        System.out.printf("最大值:%.2f\n",stat.getMax());
        System.out.printf("最小值:%.2f\n",stat.getMin());

    }
    
}
