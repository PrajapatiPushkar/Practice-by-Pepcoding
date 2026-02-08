package Basics;

//Print all the fibonacci number till the number.

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(" " +  a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
