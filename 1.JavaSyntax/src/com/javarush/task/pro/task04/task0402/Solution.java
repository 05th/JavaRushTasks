package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int x = 10;
        int y = 0;
        while (y < x) {
            y++;
            System.out.println(name + text);//напишите тут ваш код
        }
    }
}