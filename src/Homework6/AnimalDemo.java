package Homework6;

import java.util.Scanner;

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bird b = new Bird("blue", "Charlie", 1);
        Cat c = new Cat("grey", "Tommy", 3);
        Dog d = new Dog("white", "Ricky", 4);


        b.birdInfo();
        b.makeSomeNoise();
        System.out.println("Pick a number of tweet you want to hear!");
        b.sing(scan.nextInt());
        b.sing();

        b.play();
        b.fly();

        c.catInfo();
        c.makeSomeNoise();
        c.climb();
        c.play();

        d.dogInfo();
        d.makeSomeNoise();
        d.bringStick();
        d.play();


    }
}
