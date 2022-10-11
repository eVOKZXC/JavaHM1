package ru.mirea.Panferov.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[5];
        int index = 0;
        while(index < massive.length){
            System.out.printf("Введите число для %d элемента массива: ", index+1);
            massive[index] = scanner.nextInt();
            index++;
        }
        System.out.printf("Сумма массива: %d\n", Arrays.stream(massive).sum());
        System.out.printf("Максимальный элемент массива: %d\n", Arrays.stream(massive).max().getAsInt());
        System.out.printf("Минимальный элемент массива: %d", Arrays.stream(massive).min().getAsInt());
    }
}
