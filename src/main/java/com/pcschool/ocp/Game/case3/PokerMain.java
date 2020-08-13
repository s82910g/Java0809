package com.pcschool.ocp.Game.case3;


public class PokerMain {
    public static void main(String[] args) {
       // ♠S ♥H ♦D ♣C
        Poker p1 = new Poker("S", "A","\u001b[30m", 1);
        Poker p2 = new Poker("H", "A","\u001b[30m", 1);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
}
