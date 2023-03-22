package com.homeworks;

public class BoxNew {

        int height;
        int length;
        int width;

        public BoxNew(int height, int length, int width) {
            this(height, length);
            this.width = width;

            System.out.println(this.height*this.length*this.width);
        }
        public BoxNew(int height, int length) {
            this(height);
            this.length = length;
            this.width = 5;

            System.out.println(this.height*this.length*this.width);
        }
        public BoxNew(int height) {
            this();
            this.height = height;
            this.length = 10;
            this.width = 5;

            System.out.println(this.height*this.length*this.width);
        }
        public BoxNew() {
            this.height = 3;
            this.length = 10;
            this.width = 5;

            System.out.println(this.height*this.length*this.width);
        }

    }


