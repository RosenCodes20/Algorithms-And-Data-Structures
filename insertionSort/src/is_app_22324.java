import java.io.IOException;

public class is_app_22324 {
    public static void main(String[] args) throws IOException {
        int[] myArray = is_util_22324.inputArray();

        is_util_22324.printArrayBeforeSorting(myArray);

        is_util_22324.insertionSort(myArray);

        System.out.println("------------------------------------------------------");

        is_util_22324.printArrayAfterSorting(myArray);
    }
}