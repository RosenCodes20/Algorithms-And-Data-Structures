import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class app_22324 {
    public static void main(String[] args) {
        System.out.print("Please enter array length: ");
        int arrayLength;
        Scanner s = new Scanner(System.in);
        arrayLength = s.nextInt();

        int[] myArray = new Random().ints(arrayLength, 1, 100).toArray();
        System.out.println("Print before for: " + Arrays.toString(myArray));

        util_22324.bubble_sort_for(myArray);

        System.out.println("Sorted array with for: " + Arrays.toString(myArray));

        System.out.println("-----------------------");

        myArray = new Random().ints(arrayLength, 1, 100).toArray();

        System.out.println("Print before while: " + Arrays.toString(myArray));

        util_22324.bubble_sort_while(myArray);

        System.out.println("Sorted array with while: " + Arrays.toString(myArray));

    }
}