import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tema_5 {

    public static void main(String[] args) {

        System.out.println("Enter the integer for list count: ");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int[] myArray;

        myArray = new Random().ints(num, 1, 100).toArray();

        System.out.println("My array is: " + Arrays.toString(myArray));

        int MAX = myArray[0];

        for (int i = 1; i < num; i++) {

            // CHECK MAX

            if (myArray[i] > MAX) {
                MAX = myArray[i];
            }

        } // end of for

        System.out.println("MAX is: " + MAX);
    }
}