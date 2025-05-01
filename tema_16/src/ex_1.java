import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex_1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        int nToIterate = Integer.parseInt(reader.readLine());


        for (int i = 0; i < nToIterate; i++) {
            arrList.add(Integer.parseInt(reader.readLine()));
        }

        for (int num : arrList) {
            System.out.print(num + " ");
        }

        System.out.print("\n" + arrList.size());
    }
}
