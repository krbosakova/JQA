package Homework1;

import java.util.Scanner;

public class Homework1_4 {
    public static void main(String[] args) {
        //**Задача 4:**
        //Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
        //с плаваща запетая), дали е почивен ден – булев тип.
        // Съставете програма, която взема решения на базата на тези данни по следния начин:
        //- ако не е почивен ден ще работя
        //- ако имам пари и е почивен ден ще отида на кино
        //- ако нямам – ще стоя вкъщи и ще гледам телевизия
        //- ако е почивен ден
        //- ако имам по-малко от 10 лв ще отида за сладолед

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert work hours!");
        int workHours = scan.nextInt();
        System.out.println("Insert you hour work rate!");
        double hourlyRate = scan.nextDouble();
        System.out.println("Is it a holiday true or false");
        boolean holiday= scan.nextBoolean();
        double pocketMoney= workHours*hourlyRate;
        System.out.println("I have: "+pocketMoney+" leva");

        if(holiday ){
            if(pocketMoney==0){
                System.out.println("I am staying home watching tv");

            }
            if (pocketMoney>10){
                System.out.println("I am going to see a movie!");
            }
            else if(pocketMoney<10&&pocketMoney>0){
                System.out.println("I am going for an ice cream");
            }
        }
        else {
            System.out.println("I am gonna work today!");
        }
    }
}
