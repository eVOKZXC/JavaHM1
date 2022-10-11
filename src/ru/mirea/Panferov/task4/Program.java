package ru.mirea.Panferov.task4;

public class Program {
    static public void main(String[] args){
        for(int i = 0; i < 10; i++) System.out.printf("%d элемент гармонического ряда: 1/%d = %.3f\n", i+1, i+1, (float)1/(i+1));
    }
}
