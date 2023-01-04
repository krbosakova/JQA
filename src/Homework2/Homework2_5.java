package Homework2;

public class Homework2_5 {
    public static void main(String[] args) {
        int [] numbers =  {10, 12, 1, 8, 4};
        int [] copyNumbers = new int[numbers.length];

        for(int i=0; i<numbers.length; i ++) {
            copyNumbers[i]=numbers[i];
            System.out.println(copyNumbers[i]);
        }

    }
}
