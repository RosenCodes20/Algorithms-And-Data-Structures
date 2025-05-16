import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class array_list_classwork_22324 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrList = new ArrayList<Integer>(); // Инициализираме ArrayList - a

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192); // Създаваме buffered reader за вход на данните

        String[] parts = reader.readLine().split(" "); // Сплитваме първия инпут по спейс в масив

        for (int i = 0; i < parts.length; i++) {
            arrList.add(Integer.parseInt(parts[i])); // Обхождаме масив и добавяме числата в ArrayList - a
        }

        int capacity = Integer.parseInt(reader.readLine()); // Инициализираме капацитета, който е втори инпут
        int i = 0; // Нашият индекс, който започва от 0

        while (i <= arrList.size() - 2) { // докато е по - малък от дължината на масива - 2 (защото ще взимаме всеки следващ)
            int first = arrList.get(i);  // взимаме първото число за събиране
            int second = arrList.get(i + 1); // взимаме второто число за събиране

            if (first + second <= capacity) { // ако двете събрани са по - малки или равни на капацитета
                int currentCapacity = first + second; // създавам текущия капацитет

                arrList.remove(i + 1); // премахваме второто число (за да не става объркване)
                arrList.remove(i); // премахваме първото число

                arrList.add(i, currentCapacity); // добавяме текущия събран капацитет на индекса на който сме
                i = 0; // рестартираме итерациите, индекса е равен на 0 като ще обхождаме ArrayList - a на ново

            } else { // в противен случай
                i++; // увеличаваме индекса и продължаваме напред
            }
        }

        System.out.println(arrList); // връщаме като резултат ArrayList - a
    }
}
