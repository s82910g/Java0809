package com.pcschool.ocp.Game.case3;
import java.io.File;
import java.util.Scanner;


public class PokerMain2 {
    public static void main(String[] args) throws Exception {
    
         File f = new File("src\\main\\java\\com\\pcschool\\ocp\\game\\case3\\poker.txt");
       
        Scanner sc=new Scanner(f);
        //將檔案內容全部 
        String allData=sc.useDelimiter("\\A").next();
        //印出來
        System.out.println(allData);
        //透過split切割資料
        String[]rows=allData.split("\n");
        //抓第一筆
        System.out.println(rows[0]);
        //分析出每個欄位
        String[]row=rows[0].split(",");
        String mark=row[0];
        String number=row[1];
        String color=row[2];
        int value=Integer.parseInt(row[3]);
        System.out.printf("mark: %s number %s color:%s value:%d\n",mark,number,color,value);
        //建立第一個poker物件
        Poker p1=new Poker(mark,number,color,value);
        System.out.println(p1.mark);
        System.out.println(p1.number);
        System.out.println(p1.color);
        System.out.println(p1.value);

    }
}
