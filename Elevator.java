package com.homeworks;

import java.util.HashMap;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей у здания:  ");
        int H = scanner.nextInt();
        System.out.println("Ведите количество этажей при подъеме: ");
        int N = scanner.nextInt();
        System.out.println("Введите количество этажей при спуске: ");
        int M = scanner.nextInt();

        if(M >= N)
            System.out.println("Лифт не поднимется!!!");
        else
            System.out.println("Лифт поднимался : " + Lift(H, N, M) + " раз");
    }
    public static int Lift(int H, int N, int M) {
        int count = 0;
        int current = 0;

        for(count = 0; current < H; count++) {
            current += N;
            if(current >= H)
                break;
            current -= M;
        }
        return count;
    }

}


