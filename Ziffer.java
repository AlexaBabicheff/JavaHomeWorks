package com.homeworks;

public class Ziffer {
    public static void main(String[] args) {
        // определение пределов
        int min = 100;
        int max = 999;

        // генерация случайного числа в пределах
        int n = (int) (Math.random() * (max - min) + min);

        System.out.println(n);

        int z1 = n/100;
        int z2 = (n - (z1 *100))/10;
        int z3 = n - (z1 * 100) - (z2 *10);

        int zMax = z1;

        if(z2 >zMax)
            zMax = z2;
        if (z3 > zMax)
            zMax = z3;

        System.out.println(zMax);
    }
}
