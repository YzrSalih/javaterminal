package com.company;


public class Main {
    public static Boolean isItPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isItPrime(i)) {
                System.out.println(i);
            }

        }


    }
}
