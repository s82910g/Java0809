package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;


public class ArithmeticMethod4 {
    public static void main(String[] args) {
        Exam[]exam={
            new Exam(100),
            new Exam(50),
            new Exam(80),
            new Exam(90),
            new Exam(40),};
        
    Arrays.stream(exam).forEach(b-> System.out.println(b));
    System.out.println("----------------------------------");
        Arrays.stream(exam)
                .filter(b -> b.getScore() >= 60)
                .sorted(Comparator.comparing(Exam::getScore))
                .forEach(b -> System.out.println(b));
         System.out.println("----------------------------------");
         Arrays.stream(exam)
                .filter(b -> b.getScore() >= 60)
                .sorted(Comparator.comparing(Exam::getScore).reversed())
                .forEach(b -> System.out.println(b));
    }
 }

class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }
    
}