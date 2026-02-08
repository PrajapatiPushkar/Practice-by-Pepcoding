package Basics;

//check the number is prime are not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
         int n = sc.nextInt();

         int count = 0;
         for (int div = 2; div * div <= n; div++){
             if (n % div == 0) {
                 count++;
                 break;
             }
         }
         if (count == 0){
             System.out.println("prime");
         } else {
             System.out.println("Not prime");
         }


        }
    }
}
