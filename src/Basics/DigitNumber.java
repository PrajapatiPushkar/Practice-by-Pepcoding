package Basics;

//digit of number line by line

import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int noOfDigit = 0;
//        int temp = n;
//
//        while (temp != 0) {
//            temp = temp / 10;
//            noOfDigit++;
//        }
//
//        int div = (int)Math.pow(10, noOfDigit - 1);
//        while (div != 0) {
//            int q = n / div;
//            System.out.println(q);
//
//            n = n % div;
//            div = div / 10;
//        }

        int n = sc.nextInt();

        int div = 1;
        while (n / div >= 10) {
            div *= 10;
        }

        while (div != 0) {
            System.out.println(n / div);
            n = n % div;
            div = div / 10;
        }

    }
}
