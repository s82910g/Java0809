package com.pcschool.ocp.d02;


public class MultiArray4 {
    public static void main(String[] args) {
        int[][][] x={
            
                    {{100,90,80},{70,60}},
                           {{70,60}, {50}}
                        };
                 System.out.println(x);
                 System.out.println(x[0]);
                 System.out.println(x[0][0]);
                 System.out.println(x[0][0][0]);
                // System.out.println(x[1][1][1]);
            for(int i=0;i<x.length;i++){
                 for(int j=0;j<x[i].length;j++){
                      for(int k=0;k<x[i][j].length;k++){
                          System.out.println(x[i][j][k]);
                      }
                 }
            }
                 
}
}

