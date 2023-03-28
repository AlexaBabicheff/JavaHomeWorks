package com.homeworks;

import java.util.Scanner;

public class Device {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature1:  ");
        int temperature1 = sc.nextInt();

        System.out.println("Enter Temperature2:  ");
        int temperature2 = sc.nextInt();

        boolean r1 = (temperature1 > 100) && (temperature2 < 100);
        System.out.println(r1);

    }

}
