package Homework6;

abstract class Animal {
    String color;
    String name;
    int age;

    public Animal(String color, String name, int age) {
        System.out.println("Animal constructor called");
        this.color = color;
        this.name = name;
        this.age = age;
    }


    abstract void play();
}
