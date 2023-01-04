import java.util.Scanner;

public class Homework1_6 {
    public static void main(String[] args) {
        //Да се въведе число от клавиатурата от 1 до 7 и
        // да се изведе съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7!");
        int number = scan.nextInt();
        if(number>=1 && number<=7){
            switch (number){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

        }else {
            System.out.println("Wrong number!");
        }


    }
}
