
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class util_22324 {

    public static int[] input(){
        System.out.print("Please enter array length: ");
        int arrayLength;
        Scanner s = new Scanner(System.in);
        arrayLength = s.nextInt();

        int[] myArray = new Random().ints(arrayLength, 1, 100).toArray();

        return myArray;
    }

    public static void selection_sort(int[] myArray) {
        int n = myArray.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (myArray[min_idx] > myArray[j]) {
                    min_idx = j;
                }
            }

            swap(myArray, i, min_idx);
        }
    }

    public static void swap(int[] myArray, int i, int min_idx) {
        int curr_num = myArray[i];
        myArray[i] = myArray[min_idx];
        myArray[min_idx] = curr_num;
    }

    public static void print(int[] myArray) {
        System.out.println("Array before getting sorted: " + Arrays.toString(myArray));

        selection_sort(myArray);

        System.out.println("----------------------------------");

        System.out.println("Array after getting sorted: " + Arrays.toString(myArray));

    }

    public static void main(String[] args) {

    }

}