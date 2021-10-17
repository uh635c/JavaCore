package main.java.com.uh635c.javacore.Module_12_tasks;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {2, 15, 12, 8, 5, 17};
        function(array, 23);
    }

    //required method
    public static void function(int[] array, int result) {
        int firstValue = -1;
        int secondValue = -1;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            firstValue = i;
            int j = Arrays.binarySearch(array, result - array[i]);
            if (j >= 0) {
                secondValue = j;
                break;
            }
        }
        System.out.println("Indexes " + firstValue + " and " + secondValue + " with values " +
                array[firstValue] + " and " + array[secondValue] + " are gives " + result + " in summ ");
    }
}
