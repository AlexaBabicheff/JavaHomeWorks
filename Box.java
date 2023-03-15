package com.homeworks;

public class Box {
    int height;
    int length;
    int width;

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;

        System.out.println(this.height*this.length*this.width);
    }
    public Box(int height, int length) {
        this.height = height;
        this.length = length;
        this.width = 5;

        System.out.println(this.height*this.length*this.width);
    }
    public Box(int height) {
        this.height = height;
        this.length = 10;
        this.width = 5;

        System.out.println(this.height*this.length*this.width);
    }
    public Box() {
        this.height = 3;
        this.length = 10;
        this.width = 5;

        System.out.println(this.height*this.length*this.width);
    }

}
