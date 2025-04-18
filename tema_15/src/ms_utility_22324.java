import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;

public class ms_utility_22324 {

    public static int[] inputArray() throws IOException {
        System.out.print("Please enter array length: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] myArray = new Random().ints(arrayLength, 1, 100).toArray();

        return myArray;
    }

    public static void printArrayBeforeSorting(int[] myArray) {
        System.out.println("Array before merge sort: " + Arrays.toString(myArray));
    }

    public static void mergeSort(int[] myArray, int left, int middle, int right) {
        int lengthOfFirstArray = middle - left + 1;
        int lengthOfSecondArray = right - middle;

        int[] leftArray = new int[lengthOfFirstArray];
        int[] rightArray = new int[lengthOfSecondArray];

        for (int i = 0; i < lengthOfFirstArray; i++) {
            leftArray[i] = myArray[left + i];
        }

        for (int j = 0; j < lengthOfSecondArray; j++) {
            rightArray[j] = myArray[middle + j + 1];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < lengthOfFirstArray && j < lengthOfSecondArray) {
            if (leftArray[i] <= rightArray[j]) {
                myArray[k] = leftArray[i];
                i++;
            } else {
                myArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < lengthOfFirstArray) {
            myArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < lengthOfSecondArray) {
            myArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] myArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(myArray, left, middle);
            sort(myArray, middle + 1, right);

            mergeSort(myArray, left, middle, right);
        }
    }

    public static void printArrayAfterSorting(int[] myArray) {
        System.out.println("Array after merge sort: " + Arrays.toString(myArray));
    }
}