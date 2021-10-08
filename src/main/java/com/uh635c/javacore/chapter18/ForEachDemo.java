package main.java.com.uh635c.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //создать списочный массив для целых чисел
        ArrayList<Integer> val = new ArrayList<>();

        //ввести числовые занчения в списочный массив
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);

        //организовать цикл для ввода числовых значений
        System.out.print("Исходное содержимое списочного массива val: ");
        for(int i : val){
            System.out.print(i + " ");
        }

        System.out.println();

        //суммировать числовые значения в цикле
        int sum = 0;
        for(int i : val){
            sum += i;
        }

        System.out.println("Сумма числовых значений val = " + sum);
    }
}
