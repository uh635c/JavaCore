package main.java.com.uh635c.javacore.Module_12_tasks;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 6, 6, 10};
        System.out.println(findDuplicate1(array));
        System.out.println(findDuplicate2(array));
    }

    public static boolean findDuplicate1(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean findDuplicate2(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        if (set.size() != array.length) {
            return true;
        }
        return false;
    }
}
