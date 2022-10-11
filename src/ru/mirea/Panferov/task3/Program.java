package ru.mirea.Panferov.task3;

public class Program {
    static public void main(String[] args){
        for (int i = 0; i < args.length; i++) System.out.printf("%d элемент командной строки: " + args[i] + "\n", i+1);
    }
}