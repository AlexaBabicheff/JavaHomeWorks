package com.homeworks;

import java.util.Scanner;

public class Oclock {
    public static void main(String[] args) {
        // определение пределов
        int min = 0;
        int max = 28800;

        // генерация случайного числа в пределах
        int n = (int) (Math.random() * (max - min) + min);

        System.out.println(n);

        int hours = n / 3600;

        if(hours > 4)
            System.out.println("Осталось " + (n/3600) + " часов");
        else if(hours > 1)
            System.out.println("Осталось " + (n/3600) + " часa");
        else if(hours > 0)
            System.out.println("Остался 1 час");
        else
            System.out.println("Осталось менее часа");
    }
}
