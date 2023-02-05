package Homework6;

public class Dog extends Animal implements IAnimal {
    public Dog(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    void play() {
        System.out.println("The dog plays with the ball.");

    }

    void bringStick() {
        System.out.println("Dog brings the stick.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The dog is barking!");
    }


    public void dogInfo() {
        System.out.println("Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
