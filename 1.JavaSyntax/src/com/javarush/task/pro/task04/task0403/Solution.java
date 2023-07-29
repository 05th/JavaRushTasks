package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum = sum + num;
            } else if (scanner.hasNextLine()) {
                String stop = scanner.nextLine();
                if (stop.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}