package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight : ");
        int weight = scanner.nextInt();
        System.out.println("Height: (example : 1,78): ");
        double lenght = scanner.nextDouble();

        double bmi = (weight / (lenght * lenght));
        if(bmi < 18.5){
            System.out.println("thin");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("normal");
        }
        else if (bmi >= 25 && bmi < 30 ){
            System.out.println("girthy");
        }
        else{
            System.out.println("obese");
        }
        JOptionPane.showMessageDialog( null, "BMI "+ bmi);
    }
}