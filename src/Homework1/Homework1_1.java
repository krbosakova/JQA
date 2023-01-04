package Homework1;

import java.util.Scanner;
public class Homework1_1 {
    //**Задача 1:**
    //Да се изпишат подканващи съобщения към user,
    // с които да въведе две числа от клавиатурата (тип int или double).
    // След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
    // Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstCommand = "Enter an integer";
        String secondCommand = "Enter a double";
        String thirdCommand = "Enter a number";

        System.out.println(firstCommand);
        int userInt = scan.nextInt();

        System.out.println(secondCommand);
        double userDouble = scan.nextDouble();

        System.out.println(thirdCommand);
        int thirdNumber = scan.nextInt();

        String textInt = "You typed " + userInt;
        String textDouble= "You typed " + userDouble;
        String textThirdNumber = "You typed " + thirdNumber;

        System.out.println(textInt);
        System.out.println(textDouble);
        System.out.println(textThirdNumber);
        if(thirdNumber >=userInt && thirdNumber<=userDouble 	){
            System.out.println("The third number is between the first and the second one.");

        }else {
            System.out.println("The third number is not between the first and the second one.");
        }




    }
}
