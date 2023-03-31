package com.homeworks;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        // 1 уровень сложности: Представьте, что вы находитесь перед кофейным аппаратом, у него 4 кнопки, которые соответствуют напиткам: эспрессо, американо, капучино, обычная вода.
        //Напишите алгоритм, который будет предлагать клиенту выбрать напиток, нажатие кнопки (или считывания цифры, например) и в консоль будет отображаться результат приготовления (например, "Ваш <напиток> готов").
        //
        //Сделайте 2 метода, в одном из них будет реализован формат if-else, в другом - switch

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сhoose the drink for switch: Espresso (1), Americano (2), Сapuccino (3), or Water (4)");

        int drink = scanner.nextInt();

        switchExample(drink);

        System.out.println("Сhoose the drink for if: Espresso (1), Americano (2), Сapuccino (3), or Water (4)");
        drink = scanner.nextInt();

        ifExample(drink);

        scanner.close();
    }
    public static void switchExample(int drink) {
        switch (drink) {
            case 1:
                System.out.println("Your Espresso is ready");
                break;
            case 2:
                System.out.println("Your Americano is ready");
                break;
            case 3:
                System.out.println("Your Capuccino is ready");
                break;
            case 4:
                System.out.println("Your water is here");
                break;
            default:
                System.out.println("False input");
        }
    }

    public static void ifExample(int drink) {
        System.out.println();
        if (drink == 1)
            System.out.println("Your Espresso is ready");
        else if(drink == 2)
            System.out.println("Your Americano is ready");
        else if(drink == 3)
            System.out.println("Your Capuccino is ready");
        else if(drink == 4)
            System.out.println("Your water is here");
        else
            System.out.println("False input");
    }
}



