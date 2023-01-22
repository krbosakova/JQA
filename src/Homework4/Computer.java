package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer() {
        this(2005, 1000, "Linux");
    }

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer compare) {
        double comparingPrice = this.price;
        if (compare.price < comparingPrice) {
            return 1;
        } else if (compare.price > comparingPrice) {
            return -1;
        } else {
            return 0;
        }
    }
}




