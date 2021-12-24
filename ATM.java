package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainder = 5000;
        String banking_Transactions = "1.transaction : Balance Money\n"
                + "2.transaction : Withdraw money\n"
                + "3.transaction : To deposit money\n"
                + "4.transaction : Press q to exit";
        System.out.println("********************************");
        System.out.println(banking_Transactions);
        System.out.println("*********************************");

        while (true) {
            System.out.println("Can you choose transaction?");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")) {
                System.out.println("Exit the program...");
                break;
            } else if (transaction.equals("1")) {
                System.out.println("Balance money: " + remainder);

            } else if (transaction.equals("2")) {
                System.out.print("How much money do you want to withdraw?");
                int withdraw = scanner.nextInt();
                scanner.nextLine();
                if (remainder - withdraw < 0) {
                    System.out.println("You don't have enough money. Money is: " + remainder);
                } else {
                    remainder -= withdraw;
                    System.out.println("New remainder is: " + remainder);
                }

            } else if (transaction.equals("3")) {
                System.out.println("How much money do you want to deposit?");
                int withdrow = scanner.nextInt();
                scanner.nextLine();

                remainder += withdrow;

                System.out.println("New remainder is: " + remainder);

            } else {
                System.out.println("You choose is wrong transaction.");
            }
        }

    }
}
