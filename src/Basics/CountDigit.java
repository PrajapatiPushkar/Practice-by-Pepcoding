package Basics;

import java.util.Scanner;
//count the digit of a number
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        System.out.println(digit);
    }
}
