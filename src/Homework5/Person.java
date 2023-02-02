package Homework5;

public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The person is male: " + isMan);


    }

    public String getName() {
        return name;
    }


}

