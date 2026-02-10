package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int sp = 0;
        int st = n;

        for (int i = 1; i <= n; i++) {
//            System.out.print(sp + " " + st);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    }
}
