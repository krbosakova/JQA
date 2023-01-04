public class Homework2_6 {
    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 6};

        if (firstArr.length != secondArr.length) {
            System.out.println("The arrays are different.");
        } else {
            int i =0;

            for (i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    System.out.println("The arrays are different");
                    break;
                }
            }
            if (i >= firstArr.length) {
                System.out.println("The arrays are the same");
            }
        }
    }
}
