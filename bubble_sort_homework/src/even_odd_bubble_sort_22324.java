import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class even_odd_bubble_sort_22324 {

    public static int[][] separation(int[] arr) {
        int[] even_numbers = new int[arr.length];
        int[] odd_numbers = new int[arr.length];

        int even_index = 0, odd_index = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even_numbers[even_index++] = num;
            } else {
                odd_numbers[odd_index++] = num;
            }
        }

        even_numbers = Arrays.copyOf(even_numbers, even_index);
        odd_numbers = Arrays.copyOf(odd_numbers, odd_index);

        return new int[][]{even_numbers, odd_numbers};
    }

    public static void swap (int[] arr, int i) {
        int curr_number = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = curr_number;
    }


    public static void ascendingBubbleSort(int[] even_numbers) {
        int n = even_numbers.length;
        boolean swapped;

        do {
            swapped = false;
            n--;

            for (int i = 0; i < n; i++) {
                if (even_numbers[i] > even_numbers[i + 1]) {
                    swap(even_numbers, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void descendingBubbleSort(int[] odd_numbers) {
        int n = odd_numbers.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (odd_numbers[j] < odd_numbers[j + 1]) {
                    swap(odd_numbers, j);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }


    public static void main(String[] args) {

        System.out.print("Please enter array length: ");
        int arrayLength;
        Scanner s = new Scanner(System.in);
        arrayLength = s.nextInt();

        int[] arr = new Random().ints(arrayLength, 1, 100).toArray();

        int[][] result = separation(arr);

        int[] even_numbers = result[0];

        System.out.println("Even numbers before sort: " + Arrays.toString(even_numbers));

        ascendingBubbleSort(even_numbers);

        System.out.println("Sorted ascending even numbers: " + Arrays.toString(even_numbers));

        System.out.println("------------------------------");

        int [] odd_numbers = result[1];
        System.out.println("Odd numbers before sort: " + Arrays.toString(odd_numbers));

        descendingBubbleSort(odd_numbers);

        System.out.println("Sorted descending odd numbers: " + Arrays.toString(odd_numbers));
    }
}
