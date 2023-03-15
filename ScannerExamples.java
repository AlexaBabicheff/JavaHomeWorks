package com.homeworks;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls a number:  ");
        int number = sc.nextInt();

        System.out.println(number/3);
        System.out.println(number%3);

        int a1 = number/3;
        int a1_ = number%3;

        int a2 = a1/3;
        int a2_ = a1%3;

        int a3 = a2/3;
        int a3_ = a2%3;

        int a4 = a3/3;
        int a4_ = a3%3;

        int a5 = a4/3;
        int a5_ = a4%3;

        System.out.println(a5_ + "" + a4_ + "" + a3_ + "" + a2_ + "" + a1_);

        sc.close();
    }





}
