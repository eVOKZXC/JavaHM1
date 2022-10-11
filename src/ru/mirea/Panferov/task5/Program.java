package ru.mirea.Panferov.task5;

import java.util.Scanner;

public class Program {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userNum = scanner.nextInt();
        System.out.printf("Факториал числа пользователя = %d", factorial(userNum));
    }
    static public int factorial(int a){
        final int aConst = a;
        for (int i = 1; i < aConst; i++) a *= i;
        return a;
    }
}
