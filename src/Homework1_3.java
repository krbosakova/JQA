import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        //Въведете 3 числа от клавиатурата ч1, ч2 и ч3.
        // Разменете стойностите им така, че ч1 да има стойността на ч2, ч2 да има стойността на ч3, а ч3 да има старатастойност на ч1.
        // Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3.
        // Разпечатете стойностите на числата на етапи

        Scanner scan = new Scanner(System.in);

        String firstCommand = "Enter first number";
        String secondCommand = "Enter second number";
        String thirdCommand = "Enter third number";

        System.out.println(firstCommand);
        int firstNum = scan.nextInt();
        System.out.println(secondCommand);
        int secondNum = scan.nextInt();
        System.out.println(thirdCommand);
        int thirdNum = scan.nextInt();

        int box;

        box=firstNum;
        firstNum=secondNum;
        secondNum= thirdNum;
        thirdNum=box;
        System.out.println("The first number after the exchange is " + firstNum);
        System.out.println("The second number after the exchange is " + secondNum);
        System.out.println("The third number after the exchange is " + thirdNum);

        int sumFirstAndSecond = firstNum+secondNum;
        System.out.println("The sum of the first and the second number is " + sumFirstAndSecond);
        int subtraction = thirdNum - sumFirstAndSecond;
        System.out.println("The subtraction between the third number and the sum of the first two numbers is " + subtraction);
    }
}
