package com.pcschool.ocp.d02;

public class MultiArray2 {

    public static void main(String[] args) {
        int[][] x = new int[][]{{100, 90, 80}, {70, 60, 50}};
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x[0].length; i++) {
                System.out.println(x[j][i]);
            }
        }
    }
}
