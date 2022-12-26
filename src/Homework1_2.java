import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Homework1_2 {
    public static void main(String[] args) {
        //Въведете 4 различни числа от конзолата и разменете стойността им две по две.
        // Нека числата бъдат от различен тип (int и double).
        // Разпечатайте новите им стойности.
        // Направете кастване (casting) конвертиранена числата веднъж от int to double и после от double to int
        // и след всяко конвертиране изведете сумата им

        Scanner scan = new Scanner(System.in);

        String firstCommand = "Enter an integer";
        String secondCommand = "Enter a double";
        String thirdCommand = "Enter an integer";
        String forthCommand = "Enter a double";

        System.out.println(firstCommand);
        int firstNum = scan.nextInt();
        System.out.println(secondCommand);
        double secondNum = scan.nextDouble();
        System.out.println(thirdCommand);
        int thirdNum = scan.nextInt();
        System.out.println(forthCommand);
        double forthNum = scan.nextDouble();

        double box;

        box=firstNum;
        firstNum=(int)secondNum;
        secondNum= box;


        box=thirdNum;
        thirdNum=(int)forthNum;
        forthNum= box;
        System.out.println("The first number now is " + firstNum);
        System.out.println("The second number now is " + secondNum);
        System.out.println("The third number now is " + thirdNum);
        System.out.println("The forth number now is " + forthNum);

    }

}
