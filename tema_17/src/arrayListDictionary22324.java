import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class arrayListDictionary22324 {
    public static void main(String[] args) throws IOException {
        ArrayList<Map<String, Integer>> requests = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);

        String line = reader.readLine();
        while (!line.equals("END")) {
            String[] command = line.split(" ");

            if (command[0].equals("PROCESS")) {
                if (requests.isEmpty()) {
                    System.out.println("No requests");
                }

                int highestPriority = Integer.MIN_VALUE;
                int indexToTake = Integer.MIN_VALUE;

                for (Map<String, Integer> req : requests) {
                    if (req.get("priority") > highestPriority) {
                        highestPriority = req.get("priority");
                    }
                }

                for (int i = 0; i < requests.size(); i++) {
                    if (requests.get(i).get("priority") == highestPriority) {
                        indexToTake = i;
                        break;
                    }
                }

                if (indexToTake != Integer.MIN_VALUE) {
                    System.out.println(requests.get(indexToTake).get("num"));
                    requests.remove(indexToTake);
                }
            }

            else if (command[0].equals("ADD")) {
                int number = Integer.parseInt(command[1]);
                int priority = Integer.parseInt(command[2]);
                Map<String, Integer> request = new HashMap<>();

                request.put("num", number);
                request.put("priority", priority);

                requests.add(request);
            }
            line = reader.readLine();
        }

    }
}

// INPUT TO ENTER
//ADD 101 2
//ADD 102 3
//ADD 103 1
//PROCESS
//ADD 104 3
//PROCESS
//PROCESS
//PROCESS
//PROCESS
//END