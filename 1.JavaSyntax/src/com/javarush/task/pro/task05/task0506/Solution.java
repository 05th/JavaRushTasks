package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //Ввести с клавиатуры число N
        array = new int[n]; //Считать N целых чисел и заполнить ими массив
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        } //Найти минимальное число среди элементов массива и вывести в консоль
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}