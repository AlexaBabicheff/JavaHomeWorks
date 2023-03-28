package com.homeworks;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Введите население города: ");
    int people = scanner.nextInt();

        System.out.println("Введите страну Франция (1) или Германия (2)?");
    int country = scanner.nextInt();
        scanner.close();

    switchExample(people, country);

}

    public static void switchExample(int people, int country) {
        switch (country) {
            case 1:
                if (people < 200000)
                    System.out.println("город маленький");
                else if (people < 500000)
                    System.out.println("город средний");
                else if (people > 500000)
                    System.out.println("город большой");
                break;

            case 2:
                if (people < 100000)
                    System.out.println("город маленький");
                else if (people < 400000)
                    System.out.println("город средний");
                else if (people > 400000)
                    System.out.println("город большой");
                break;
        }
    }
}
