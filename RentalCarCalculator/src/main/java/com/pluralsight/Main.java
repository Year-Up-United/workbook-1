package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome, let's get you set up with a rental car!");


// add scanner for input
      Scanner scanner = new Scanner(System.in);

// ask the first question
      System.out.println("Please enter in your pickup day (mm/dd/yyyy): ");
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
      double underageChargeRate = .30;


// if statements
     if (age <=24){
         System.out.println("You will be charged an additional 30% for your rental.");
//         underageChargeRate = carRental - (carRental *.30);
     }

// compute prices
    double basicRentalCost = carRental * numDays;

// compute options
    double optionsCost = 0;

// if statements
    if (tollPass.equalsIgnoreCase("yes")){
        optionsCost += tollTag * numDays;
    }
    if (addGPS.equalsIgnoreCase("yes")){
        optionsCost += gpsDevice * numDays;
    }
    if (roadHelp.equalsIgnoreCase("yes")){
        optionsCost += roadAssit * numDays;
    }

// underage fee
    double underageFee = 0;

// underage calculation
    if (age < 25){
        underageFee = basicRentalCost * underageChargeRate;
    }

// total cost
    double totalCost = basicRentalCost + optionsCost + underageFee;

// print this at the end
    System.out.printf("\nPickup Date: %s\n", rentalCar);
    System.out.printf("Basic Rental Cost: $%.2f\n", basicRentalCost);
    System.out.printf("Options Cost: $%.2f\n", optionsCost);
    System.out.printf("Underage Driver additional fee: $%.2f\n", underageFee);
    System.out.printf("Total Cost: $%.2f\n", totalCost);

// thank you message
    System.out.println("Thanks for choosing us to book your rental!");


}
   }