import java.util.Arrays;
import java.util.Random;

public class min_max {

    public static void main(String[] args) {

        System.out.println("Find MIN and MAX");

        int[] myArray = new Random().ints(10, 1, 50).toArray();

        System.out.println("My array is: " + Arrays.toString(myArray));

        int MAX = myArray[0];
        int MIN = myArray[0];

        for (int i = 1; i < 10; i++) {

            // CHECK MIN

            if (myArray[i] < MIN) {
                MIN = myArray[i];
            }

            // CHECK MAX

            if (myArray[i] > MAX) {
                MAX = myArray[i];
            }

        } // end of for

        System.out.println("MAX is: " + MAX);
        System.out.println("MIN is: " + MIN);

    } // end of main

} // end of class