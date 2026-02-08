package Basics;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("you got Excellent!");
        } else if (marks > 80) {
            System.out.println("You got good!");
        } else if (marks > 70) {
            System.out.println("You got fair.");
        } else if (marks > 60) {
            System.out.println("You need more hard work");
        } else {
            System.out.println("You are failed!");
        }

    }
}
