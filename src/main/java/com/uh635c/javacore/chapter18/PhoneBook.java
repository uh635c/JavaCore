package main.java.com.uh635c.javacore.chapter18;

import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        //Попытаться открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            //игнорировать отсутствие файла
        }
        // Если телефонная книга уже существует, загрузить существующие телефоны номеров
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        //Разрешить пользователю вводить новые имена и номера телефонов абонентов
        do {
            System.out.println("Введите имя " + "('quite' для завершения): ");
            name = br.readLine();
            if (name.equals("quite")) {
                continue;
            }
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("quite"));
        //сохранить телефонную книгу, если она изменилась
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }
        // искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска " + "('quite' для завершения)");
            name = br.readLine();
            if(name.equals("quite")){
                continue;
            }
            number = (String)ht.get(name);
            System.out.println(number);
        }while(!name.equals("quite"));
    }
}
