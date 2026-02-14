package Functions;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number
        int b = sc.nextInt(); // base
        int d = getValueInDecimal(n, b); // decimal
        System.out.println(d); // print decimal number
    }

    public static int getValueInDecimal(int n, int b){
        int rv = 0; // return value

        int p = 1; // power
        while (n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;
        }

        return rv;
    }
}
