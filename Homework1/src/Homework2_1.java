import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        System.out.println(sumOfTwoNum(firstNumber,secondNumber));
    }
    static int sumOfTwoNum(int num1,int num2){
        return num1+num2;
    }
}
