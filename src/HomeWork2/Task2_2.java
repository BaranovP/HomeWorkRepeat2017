package HomeWork2;

import java.util.Scanner;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance");
        int balance = sc.nextInt();  //balance = 100
        System.out.println("Enter withdrawal");
        int withdrawal = sc.nextInt(); // 10 or 99

        withdrawAction(balance, withdrawal);

    }

    static void withdrawAction(int balance, int withdrawal) {
        double commision = (5.0 * withdrawal)/100;
        double total = balance - withdrawal - commision;
        if (total >= 0)
            System.out.println("OK " + commision + " " + total);
        else
            System.out.println("NO");

    }

}
