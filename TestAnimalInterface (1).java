package com.homeworks.animals;

public class TestAnimalInterface {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.voice();

        Cat cat = new Cat();
        cat.sleep();
        cat.eat();
        cat.voice();
    }

}
class Animals implements AnimalInterface {

    @Override
    public void sleep(){
        System.out.println("Sleeping");

    }
    @Override
    public void eat(){
        System.out.println("Eating");

    }
    @Override
    public void voice(){
        System.out.println("Sound");

    }
}

interface AnimalInterface {
    void sleep();
    void eat();
    void voice();
}

class Dog extends Animals{

    @Override
    public void voice() {
        System.out.println("belling");
    }
}

class Cat extends Animals{

    @Override
    public void voice() {
        System.out.println("mewing");
    }
}