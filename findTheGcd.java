package com.company;


import java.util.Scanner;

public class Main {
    public static int findTheGcd(int number1, int number2) {
        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first_number = scanner.nextInt();

        System.out.println("Second number: ");
        int second_number = scanner.nextInt();
        System.out.println("Two numbers gcd: " + findTheGcd(first_number, second_number));
    }
}
