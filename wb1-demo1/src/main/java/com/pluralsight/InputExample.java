package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;
public class InputExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name;
        name = scanner.nextLine();

        System.out.println("Hi " + name + ", lets do some math!");


        System.out.println("What is the first number?");
        double number11 = scanner.nextDouble();
        System.out.println("What is the second number?");
        double number21 = scanner.nextDouble();

        double number1 = 4;
        double number2 = 5;
        double product = number1 + number2;

        System.out.printf("The product of %f and %f is %f\n", number1, number2, product);
       // System.out.println("The product of " + String.format("%.2f", number1) + " and " + number2 + )
    }
}
