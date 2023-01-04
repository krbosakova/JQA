package Homework2;

import java.util.Scanner;

public class Homework2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int [10];
        for(int i=0;i<numbers.length;i++ ){
            numbers[i]=scan.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        int k=0;
        while (k<10){
            System.out.println(numbers[k]);
            k++;
        }
    }
}
