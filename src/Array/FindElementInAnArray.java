package Array;

import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element that you are find: ");
        int data = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == data) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);

    }
}
