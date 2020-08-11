package com.pcschool.ocp.d01;

public class PetStore2 {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2=new Cat();
        Cat.type="波絲貓";
        c1.name="小橘";c1.age=2; c1.amount=20;c1.price=2000;
        c2.name="小黑";c2.age=5; c2.amount=30;c2.price=1000;
        System.out.printf("品種:%s 名字:%s 年紀:%d 數量%d 價格:%d,小計:%d\n",
                Cat.type,c1.name,c1.age,c1.amount,c1.price,c1.price*c1.amount);
        System.out.printf("品種:%s 名字:%s 年紀:%d 數量%d 價格:%d,小計:%d\n",
                Cat.type,c2.name,c2.age,c2.amount,c2.price,c2.price*c2.amount);
        int sum=c1.price*c1.amount+c2.price*c2.amount;
        System.out.printf("貓總值為:%,d",sum);
    }
}
