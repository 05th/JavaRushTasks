package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)) {//напишите тут ваш код
            System.out.println("строки одинаковые");
            //напишите тут ваш код
        } else {
            System.out.println("строки разные");
        }
    }
}