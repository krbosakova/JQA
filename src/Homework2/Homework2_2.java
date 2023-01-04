package Homework2;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        System.out.println(averageOfTwoNum(firstNumber,secondNumber));
    }
    static int averageOfTwoNum(int num1,int num2) {
        return (num1 + num2) / 2;
    }
}
