package Homework6;

public class Bird extends Animal implements IAnimal {

    public Bird(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    void play() {
        System.out.println("The bird is playing.");

    }

    void fly() {
        System.out.println("The bird is flying around.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The bird starts to sing!");
    }

    void sing() {
        System.out.println("Tut tut tut!");
    }

    void sing(int voice) {
        for (int i = 0; i < voice; i++) {
            System.out.println("tweet");
        }
    }

    public void birdInfo() {
        System.out.println("Bird{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}

