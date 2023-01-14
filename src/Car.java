package Homework3;

import java.lang.reflect.Field;


class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (freeFuel >= fuel) {
            freeFuel = freeFuel - fuel;
        } else {
            System.out.println("Not enough free fuel!");
        }
    }

}

class CarPerson {
    public static void main(String[] args) throws IllegalAccessException {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar1.year = 2010;
        myCar1.price = 50.20;
        myCar1.isSportCar = true;
        myCar1.fuelTankCapacity = 100;
        myCar1.freeFuel = 80;
        myCar1.engineFuelOperationSystem = "Petrol";
        myCar1.useFuel(35);

        myCar2.year = 2000;
        myCar2.price = 10.5;
        myCar2.isSportCar = false;
        myCar2.fuelTankCapacity = 80;
        myCar2.freeFuel = 20;
        myCar2.engineFuelOperationSystem = "Petrol";
        myCar2.changeEngineFuelOperationSystem("Gas");

        System.out.println("First car fields");
        for (Field field : myCar1.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(myCar1);
            System.out.printf("%s: %s%n", name, value);
        }
        
        System.out.println("Second car fields");
        for (Field field : myCar2.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(myCar2);
            System.out.printf("%s: %s%n", name, value);
        }
    }
}

