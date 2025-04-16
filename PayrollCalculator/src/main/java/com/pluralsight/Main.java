package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner payscanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name;
        name = payscanner.nextLine();

        System.out.println("How many hours did you work?");
        double hoursWorked = payscanner.nextInt();

        System.out.println("What is your pay rate?");
        double payRate = payscanner.nextInt();

        System.out.printf("Hello %s, your gross pay is $%.0f", name, hoursWorked);
    }

}


