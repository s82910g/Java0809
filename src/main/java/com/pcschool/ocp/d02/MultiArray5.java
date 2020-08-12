package com.pcschool.ocp.d02;


public class MultiArray5 {
    public static void main(String[] args) {
        char[][] ttt={
                        {'o','o','x'},
                        {'x','o',' '},
                        {'x',' ','x'},};
        // System.out.print(ttt[0][0]);
       /* for(int i=0;i<ttt.length;i++){
            for(int j=0;j<ttt[i].length;j++){
                System.out.print(ttt[i][j]);
            }
            System.out.println("");
        }*/
               int x=7;
               ttt[x/3][x%3]='o';
               for(int i=0;i<ttt.length;i++){
            
                System.out.print(ttt[i]);//char陣列 可以直接印出來，不用迴圈兩次
            
            System.out.println("");
        }
                        
        }
    }

