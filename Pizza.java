package com.homeworks;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите диаметр пиццы: ");

        double diameter = sc.nextDouble();

        double area = Math.PI * Math.pow((diameter/2), 2);
        System.out.println("Площадь пиццы равна: " + area);


    }
}
