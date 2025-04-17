import java.util.Arrays;
import java.util.Random;

public class merge_sort_main_22324 {

    public static void main(String[] args) {
        System.out.println(":: Merge Sort Measurements ::");

        int[] myArrayWith1000 = new Random().ints(1000, 1, 1000).toArray();
        int[] myArrayWith1000Copy = Arrays.copyOf(myArrayWith1000, myArrayWith1000.length);
        int[] myArrayWith10000 = new Random().ints(10000, 1, 10000).toArray();
        int[] myArrayWith10000Copy = Arrays.copyOf(myArrayWith10000, myArrayWith10000.length);
        int[] myArrayWith100000 = new Random().ints(100000, 1, 100000).toArray();
        int[] myArrayWith100000Copy = Arrays.copyOf(myArrayWith100000, myArrayWith100000.length);
        int[] myArrayWith1000000 = new Random().ints(1000000, 1, 1000000).toArray();
        int[] myArrayWith1000000Copy = Arrays.copyOf(myArrayWith1000000, myArrayWith1000000.length);


        long startNanoTimeForFirstArr = System.nanoTime();

        long inversionsForFirstArr = merge_sort_methods_22324.sort(myArrayWith1000, 0, myArrayWith1000.length - 1);

        long endNanoTimeForFirstArr = System.nanoTime();

        long nanoTimeForFirstArray = endNanoTimeForFirstArr - startNanoTimeForFirstArr;

        double milisForFirstArr = nanoTimeForFirstArray / 1000000.0;

        long startNanoTimeForFirstArrWithSort = System.nanoTime();

        Arrays.sort(myArrayWith1000Copy);

        long endNanoTimeForFirstArrWithSort = System.nanoTime();

        long nanoTimeForFirstArrWithSort = endNanoTimeForFirstArrWithSort - startNanoTimeForFirstArrWithSort;
        double milisForFirstArrWithSort = nanoTimeForFirstArrWithSort / 1000000.0;


        System.out.println("Check for 1000 elements");
        System.out.println("Elapsed time : sort: " + nanoTimeForFirstArrWithSort + " nanoseconds " + milisForFirstArrWithSort + " miliseconds");
        System.out.println("Elapsed time ; merge sort: " + nanoTimeForFirstArray + " nanoseconds " + milisForFirstArr + " miliseconds.");
        System.out.println("Inversions for first arr with merge sort: " + inversionsForFirstArr);

        long startNanoTimeForSecondArr = System.nanoTime();

        long inversionsForSecondArr = merge_sort_methods_22324.sort(myArrayWith10000, 0, myArrayWith10000.length - 1);

        long endNanoTimeForSecondArr = System.nanoTime();

        long nanoTimeForSecondArray = endNanoTimeForSecondArr - startNanoTimeForSecondArr;

        double milisForSecondArr = nanoTimeForSecondArray / 1000000.0;

        long startNanoTimeForSecondArrWithSort = System.nanoTime();

        Arrays.sort(myArrayWith10000Copy);

        long endNanoTimeForSecondArrWithSort = System.nanoTime();

        long nanoTimeForSecondArrWithSort = endNanoTimeForSecondArrWithSort - startNanoTimeForSecondArrWithSort;
        double milisForSecondArrWithSort = nanoTimeForSecondArrWithSort / 1000000.0;

        System.out.println();
        System.out.println("Check for 10000 elements");
        System.out.println("Elapsed time : sort: " + nanoTimeForSecondArrWithSort + " nanoseconds " + milisForSecondArrWithSort + " miliseconds");
        System.out.println("Elapsed time ; merge sort: " + nanoTimeForSecondArray + " nanoseconds " + milisForSecondArr + " miliseconds.");
        System.out.println("Inversions for second arr with merge sort: " + inversionsForSecondArr);

        long startNanoTimeForThirdArr = System.nanoTime();

        long inversionsForThirdArr = merge_sort_methods_22324.sort(myArrayWith100000, 0, myArrayWith100000.length - 1);

        long endNanoTimeForThirdArr = System.nanoTime();

        long nanoTimeForThirdArray = endNanoTimeForThirdArr - startNanoTimeForThirdArr;

        double milisForThirdArr = nanoTimeForThirdArray / 1000000.0;

        long startNanoTimeForThirdArrWithSort = System.nanoTime();

        Arrays.sort(myArrayWith100000Copy);

        long endNanoTimeForThirdArrWithSort = System.nanoTime();

        long nanoTimeForThirdArrWithSort = endNanoTimeForThirdArrWithSort - startNanoTimeForThirdArrWithSort;
        double milisForThirdArrWithSort = nanoTimeForThirdArrWithSort / 1000000.0;

        System.out.println();
        System.out.println("Check for 100000 elements");
        System.out.println("Elapsed time : sort: " + nanoTimeForThirdArrWithSort + " nanoseconds " + milisForThirdArrWithSort + " miliseconds");
        System.out.println("Elapsed time ; merge sort: " + nanoTimeForThirdArray + " nanoseconds " + milisForThirdArr + " miliseconds.");
        System.out.println("Inversions for third arr with merge sort: " + inversionsForThirdArr);

        long startNanoTimeForFourthArr = System.nanoTime();

        long inversionForFourthArr = merge_sort_methods_22324.sort(myArrayWith1000000, 0, myArrayWith1000000.length - 1);

        long endNanoTimeForFourthArr = System.nanoTime();

        long nanoTimeForFourthArray = endNanoTimeForFourthArr - startNanoTimeForFourthArr;

        double milisForFourthArr = nanoTimeForFourthArray / 1000000.0;

        long startNanoTimeForFourthArrWithSort = System.nanoTime();

        Arrays.sort(myArrayWith1000000Copy);

        long endNanoTimeForFourthArrWithSort = System.nanoTime();

        long nanoTimeForFourthArrWithSort = endNanoTimeForFourthArrWithSort - startNanoTimeForFourthArrWithSort;
        double milisForFourthArrWithSort = nanoTimeForFourthArrWithSort / 1000000.0;

        System.out.println();
        System.out.println("Check for 1000000 elements");
        System.out.println("Elapsed time : sort: " + nanoTimeForFourthArrWithSort + " nanoseconds " + milisForFourthArrWithSort + " miliseconds");
        System.out.println("Elapsed time ; merge sort: " + nanoTimeForFourthArray + " nanoseconds " + milisForFourthArr + " miliseconds.");
        System.out.println("Inversions for fourth arr with merge sort: " + inversionForFourthArr);
    }
}