package com.pcschool.ocp.Game.case2;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        int[] ans = Util.getRandomIntArray(4);
        int[] user = {0, 0, 0, 0};
        //第一次
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入4個數字:");
            String userAns = sc.nextLine();
            for (int i = 0; i < user.length; i++) {
                user[i] = Integer.parseInt(userAns.charAt(i) + "");
            }
            //列出user陣列資料
            for (int x : user) {
                System.out.print(x + "");
            }
            int A = 0, B = 0;
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < user.length; j++) {

                    if (j == i && user[j] == ans[i]) {
                        A += 1;
                    } else if (user[j] == ans[i]) {
                        B += 1;
                    }
                }
            }
            System.out.println("");
            if (A == 4) {
                System.out.println("恭喜答對了!");
                break;
            }
            System.out.printf("%dA%dB", A, B);
            System.out.println("");
            //

        }
    }
}
