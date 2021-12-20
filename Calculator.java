package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************");
        String processes = "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Dividing\n"
                + "4. Multiplication";
        System.out.println(processes);
        System.out.println("***********************************");
        System.out.println("which processes do u want?");
        String process = scanner.nextLine();
        int a;
        int b;
        switch (process) {
            case "1":
                System.out.println("First number: ");
                a = scanner.nextInt();
                System.out.println("Second number: ");
                b = scanner.nextInt();
                System.out.println("Addition is: " + (a + b));
                break;
            case "2":
                System.out.println("First number: ");
                a = scanner.nextInt();
                System.out.println("Second number: ");
                b = scanner.nextInt();
                System.out.println("Subtraction is: " + (a - b));
                break;
            case "3":
                System.out.println("First number: ");
                a = scanner.nextInt();
                System.out.println("Second number: ");
                b = scanner.nextInt();
                System.out.println("Dividing is: " + ((double) a / b));
                break;
            case "4":
                System.out.println("First number: ");
                a = scanner.nextInt();
                System.out.println("Second number: ");
                b = scanner.nextInt();
                System.out.println("Multiplication is: " + (a * b));
                break;


        }


    }
}