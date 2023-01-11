package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praktika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявление Scanner
        System.out.println("Введите кол-во элементов массива:"); //
        int size = input.nextInt(); // читаем с клавиатуры размер массива
        List<Integer> intArray = new ArrayList<>(); // создаем массив int размером size
        System.out.println("Введите элементы массива:"); // пройдемся по массиву, заполнив его

        for (int i=0; i<size; i++) {
            intArray.add(input.nextInt()); // заполняем массив элементами, введенными с клавиатуры
        }
        int minNum;
        minNum = intArray.get(0);

        for (int j : intArray) {
            if (j > minNum)
                minNum = j;
        }

        System.out.println("Максимальное число: = " + minNum);
    }
}
