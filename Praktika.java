package org.example;
import java.util.Scanner;
public class Praktika {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите 1 число: ");
    float num1 = scan.nextFloat();

        System.out.print("Введите 2 число: ");
        float num2 = scan.nextFloat();

        if (num1>num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
