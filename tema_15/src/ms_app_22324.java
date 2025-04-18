import java.io.IOException;

public class ms_app_22324 {
    public static void main(String[] args) throws IOException {
        int[] myArray = ms_utility_22324.inputArray();

        ms_utility_22324.printArrayBeforeSorting(myArray);

        ms_utility_22324.sort(myArray, 0, myArray.length - 1);

        ms_utility_22324.printArrayAfterSorting(myArray);
    }
}
