package ru.mirea.Panferov.task1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Program {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++){
            System.out.printf("Введите число для %d элемента массива: ", i+1);
            massive[i] = scanner.nextInt();
        }
        System.out.printf("Сумма массива: %d\n", Arrays.stream(massive).sum());
        System.out.printf("Среднее арифметическое массива: %.2f", Arrays.stream(massive).average().orElse(0));
    }
}
