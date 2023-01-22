package Homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        Computer firstComputer = new Computer();
        Computer secondComputer = new Computer(1999, 2000, "Windows");

        System.out.println(firstComputer.comparePrice(secondComputer));

    }
}
