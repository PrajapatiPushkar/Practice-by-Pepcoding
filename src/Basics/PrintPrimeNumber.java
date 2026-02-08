package Basics;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {

            if (i <= 1) {
                continue; // skip 0 and 1
            }

            int count = 0;

            for (int div = 2; div * div <= i; div++) {

                if (i % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
