public class util_22324 {
    public static void bubble_sort_for(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){

                    swap(arr, j);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    } // end of bubble sort for

    public static void bubble_sort_while(int[] arr){
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            n--;

            for (int i = 0; i < n ; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    swapped = true;
                }
            }


        }   while (swapped);

    } //end of bubble sort while

    public static void swap(int[] arr, int j){
        int curr_num = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = curr_num;
    }

    public static void main(String[] args) {

    }
}