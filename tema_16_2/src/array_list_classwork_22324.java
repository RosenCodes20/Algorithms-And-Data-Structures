import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class array_list_classwork_22324 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);

        String[] parts = reader.readLine().split(" ");

        for (int i = 0; i < parts.length; i++) {
            arrList.add(Integer.parseInt(parts[i]));
        }

        int capacity = Integer.parseInt(reader.readLine());

        boolean isCombined = false;

        int i = 0;

        while (i <= arrList.size() - 2) {
            int first = arrList.get(i);
            int second = arrList.get(i + 1);

            if (first + second <= capacity) {
                isCombined = true;

                int currentCapacity = first + second;

                arrList.remove(i + 1);
                arrList.remove(i);

                arrList.add(i, currentCapacity);
                i = 0;

            } else {
                isCombined = false;
                i++;
            }
        }
        
        for (int num : arrList) {
            System.out.print(num + " ");
        }
    }
}
