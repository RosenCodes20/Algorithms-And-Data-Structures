import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ex_3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Float> arrList = new ArrayList<Float>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        int nToIterate = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nToIterate; i++) {
            arrList.add(Float.parseFloat(reader.readLine()));
        }

        Collections.sort(arrList);

        if (arrList.size() % 2 != 0) {
            float median = arrList.get(arrList.size() / 2);

            System.out.println(median);

        } else {
            float mid1 = arrList.get(arrList.size() / 2 - 1);
            float mid2 = arrList.get(arrList.size() / 2);
            float median = (mid1 + mid2) / 2;

            System.out.println(median);
        }
    }
}
