import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;

public class is_util_22324 {

    public static int[] inputArray() throws IOException {
        System.out.print("Please enter array length: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] myArray = new Random().ints(arrayLength, 1, 100).toArray();

        return myArray;
    }

    public static void printArrayBeforeSorting(int[] myArray) {
        System.out.println("Array before insertion sort: " + Arrays.toString(myArray));
    }

    public static void insertionSort(int[] myArray) {
        int n = myArray.length;

        for (int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }

            myArray[j + 1] = key;
        }
    }

    public static void printArrayAfterSorting(int[] myArray) {
        System.out.println("Array after insertion sort: " + Arrays.toString(myArray));
    }

    public static void main(String[] args) {

    }
}
