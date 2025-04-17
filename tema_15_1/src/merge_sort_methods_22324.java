public class merge_sort_methods_22324 {
    public static long mergeSort(int[] myArray, int left, int middle, int right) {
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
        long inversions = 0;

        while (i < lengthOfFirstArray && j < lengthOfSecondArray) {
            if (leftArray[i] <= rightArray[j]) {
                myArray[k] = leftArray[i];
                i++;
            } else {
                myArray[k] = rightArray[j];
                inversions += 1;
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

        return inversions;
    }

    public static long sort(int[] myArray, int left, int right) {
        long inversions = 0;
        if (left < right) {
            int middle = (left + right) / 2;

            inversions += sort(myArray, left, middle);
            inversions += sort(myArray, middle + 1, right);
            inversions += mergeSort(myArray, left, middle, right);
        }
        return inversions;
    }

    public static void main(String[] args) {

    }
}
