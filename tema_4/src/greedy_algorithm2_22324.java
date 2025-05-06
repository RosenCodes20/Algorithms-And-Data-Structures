import java.util.Scanner;

public class greedy_algorithm2_22324 {
    public static void main(String[] args) {

        int[] nominal = {50, 20, 10, 5};

        double amount = 0.00;

        int c_count = 0;
        int t_count = 0;
        int index = 0;

        System.out.println("Please input the amount to convert [BGN]: ");
        amount = new Scanner(System.in).nextDouble();

        //convert to cents

        amount = amount * 100;

        System.out.println("Amount in cents is: " + amount);

        while (amount > 0) {
            for (int currnom: nominal) {
                c_count = (int) (amount / currnom);
                t_count = t_count + c_count;
                System.out.println("Coins of nominal " + currnom + " used: " + c_count);

                amount = amount % currnom;
                System.out.println("Amount remaining after current iteration: " + amount);
            }

            if (amount > 0) {
                System.out.println("=========================================");
                System.out.println("Not enough nominals to present the amount!");
                System.out.println("Total coins used: " + t_count);
                System.out.println("Amount remaining [cents]: " + amount);
                break;
            }
        }

    }
}
