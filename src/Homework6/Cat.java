package Homework6;

public class Cat extends Animal implements IAnimal {


    public Cat(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    void play() {
        System.out.println("The cat plays with the mouse.");

    }

    void climb() {
        System.out.println("Going up!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The cat meows!");
    }

    public void catInfo() {
        System.out.println("Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
