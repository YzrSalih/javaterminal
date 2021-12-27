package Exercises.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a-b-c-d
        // abc - abd - acd - bcd
        // 4 different triangles can be generated

        System.out.println("Can u enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Can u enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Can u enter c: ");
        double c = scanner.nextDouble();
        System.out.println("Can u enter d: ");
        double d = scanner.nextDouble();

        System.out.println("Area of Triangle 1 : " + findArea(a, b, c));
        System.out.println("Area of Triangle 2 : " + findArea(a, b, d));
        System.out.println("Area of Triangle 3 : " + findArea(a, c, d));
        System.out.println("Area of Triangle 4 : " + findArea(b, c, d));
    }
    public static float findArea(double a, double b, double c) {

        if (a < 0 || b < 0 || c < 0 || (a + b <= c) ||
                a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
        double s = (a + b + c) / 2;
        return (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
