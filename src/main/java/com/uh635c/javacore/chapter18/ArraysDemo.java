package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        //выделить и инициализировать массив
        int [] array  = new int[10];
        for (int i=0 ; i<10; i++){
            array[i] =-3*i;
        }

        //вывести, отсортироват и снова вывести содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        //заполнить массив и вывести его содержимое
        Arrays.fill(array,2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        //отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повтороной сортировки: ");
        display(array);

        //выполнить двоичный поиск значения -9
        System.out.print("Значение -9 находиться на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array) {
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
