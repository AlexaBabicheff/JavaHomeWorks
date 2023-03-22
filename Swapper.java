package com.homeworks;

import java.util.Scanner;

public class Swapper {

    public static void main(String[] args) {

            int a = 100;
        System.out.println("Значение1 = " + a);

            int b = 150;
        System.out.println("Значение2 = " + b);

        new Swapper().rotate(a,b);
        }

        public void rotate2(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

            System.out.println("Значение1 = " + a);
            System.out.println("Значение2 = " + b);
        }


    public void rotate(int a, int b) {

        int c = a;
        a = b;
        b = c;

        System.out.println("Значение1 = " + a);
        System.out.println("Значение2 = " + b);
}
}




