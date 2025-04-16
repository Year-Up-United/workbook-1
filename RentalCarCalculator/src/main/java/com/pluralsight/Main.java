package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome, lets get you set up with a rental car!");


// add scanner for input
      Scanner scanner = new Scanner(System.in);

// ask the first question
      System.out.println("Please enter in your pickup day (mm/dd/yyyy) ");
// scanner for date they pick up car
      String rentalCar = scanner.nextLine();

// ask for days needed in rental
      System.out.println("How many days are needed in the rental?");

// scanner for the days needed
      int numDays = scanner.nextInt();

// string inputs needed
      scanner.nextLine();

// ask if they want a toll tag
      System.out.println("Would you like to add an electric toll pass for an additional $3.95/day?");

// scanner for tolls
      String tollPass = scanner.nextLine();

// ask if they want GPS
      System.out.println("Would you like to add GPS for an additional $2.95/day?");

// scanner for GPS
      String addGPS = scanner.nextLine();

// ask if they want roadside assistance
      System.out.println("Would you like to add roadside assistance for an additional $3.95/day");

// scanner for roadside assistance
      String roadHelp = scanner.nextLine();

// ask for age
      System.out.println("Please input your age");

// scanner for age
      int age = scanner.nextInt();

// rates and prices
      double carRental = 29.99;
      double tollTag = 3.95;
      double gpsDevice = 2.95;
      double roadAssit = 3.95;
      double underageCharge = .30;











}
   }