import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ex_2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrList = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        int nToIterate = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nToIterate; i++) {
            arrList.add(reader.readLine());
        }

        Iterator<String> iterator = arrList.iterator();

        while (iterator.hasNext()) {
            String currentName = iterator.next();

            if (currentName.length() % 2 != 0) {
                iterator.remove();
            }
        }

        for (String s : arrList) {
            System.out.print(s + " ");
        }
    }
}
