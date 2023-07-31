package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int bigger = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min) {
                bigger = min;
                min = x;
            } else if (x > min && x < bigger) {
                bigger = x;
            }
        }
        System.out.println(bigger);
    }
}