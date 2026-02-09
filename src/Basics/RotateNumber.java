package Basics;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // count number of digits
        int temp = n;
        int nod = 0;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // normalize k
        k = k % nod;

        if (k < 0) {
            k = k + nod;
        }

        int div = 1;
        int mul = 1;

        for (int i = 1; i <= nod; i++) {

            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int ans = r * mul + q;

        System.out.println("Rotated number: " + ans);
    }
}
