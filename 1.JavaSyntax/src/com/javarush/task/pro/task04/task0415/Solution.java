package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int s = (int) (PI * radius * radius);
        System.out.println(s);
    }
}