package Homework2;

import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double [5];
        for(int i=0;i<numbers.length;i++ ){
            numbers[i]=scan.nextDouble();
        }

        for (double number : numbers) {
            System.out.println(number);
        }

    }
}
