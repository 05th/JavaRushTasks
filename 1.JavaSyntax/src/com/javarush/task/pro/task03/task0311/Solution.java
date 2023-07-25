package com.javarush.task.pro.task03.task0311;

import java.util.Map;
import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(b - a) < 0.000001) {//напишите тут ваш код
            System.out.println("числа равны");
        } else { //напишите тут ваш код
            System.out.println("числа не равны");
        }
    }
}