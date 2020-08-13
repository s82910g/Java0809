package com.pcschool.ocp.d03;

import java.util.Random;

public class ArithmeticMehtod {

    public static void main(String[] args) {
        char pocker[] = "A234567890JQK".toCharArray();
        //shuffle洗牌
        for (int i = 0; i <= 100; i++) {
            Random r = new Random();
            int from = r.nextInt(pocker.length);
            int to = r.nextInt(pocker.length);
            char c = pocker[from];//先記住[0]的資料
            pocker[from] = pocker[to];
            pocker[to] = c;
        }
        //列印
        for (char p : pocker) {
            System.out.print(p + " ");
        }
        System.out.println();

    }
}
