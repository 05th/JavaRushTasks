package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        int y = (int) Math.round(x * 3.6);
        System.out.println(y);
    }
}