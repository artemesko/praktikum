package org.example;

public class Praktika {
    public static void main(String[] args) {
        int[] intArray = {15, 4, 44, 55, 84, 490, 2};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Максимальное число: = " + maxNum);
    }
}
