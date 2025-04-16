package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // add scanner for input
        Scanner scanner = new Scanner(System.in);

        // sandwich prices
        double basePriceRegularSize = 5.45;
        double basePriceLargeSize = 8.95;
        double price = 0;

        // print display for taking orders

        System.out.println("What size sandwich would you like?");
        System.out.println("(1) regular size");
        System.out.println("(2) large size");
        System.out.print("select your pick");

        // selection has to be made from 1-2 options

        // add scanner for sandwich size
        int choice = scanner.nextInt();


       // print display for age
        System.out.println("How old are you?");

        //  add scanner for age input
        int age = scanner.nextInt();

        // if statements for selection
        if (choice == 1) {
            System.out.println("You want a regular sandwich.");
        }
        else if (choice == 2) {
            System.out.println("You want a large sandwich.");
        }

        // if statements for sandwich percentage
        if (age <=17 && choice == 1){
            price = basePriceRegularSize - basePriceRegularSize*.10;

        } else if (age >=65 && choice == 1)
            {price = basePriceRegularSize - basePriceRegularSize*.20;}


            if (age <=17 && choice == 2)
                { price = basePriceLargeSize - basePriceLargeSize*.10;}

            else if (age >=65 && choice == 2) {
                price = basePriceLargeSize - basePriceLargeSize*.20;}


        System.out.printf("The total is %.2f " , price);

    }

        // variable for percentage
        double discountPercent;
        double studentPercent = .10;
        double seniorPercent = .20;

        // code to change original price
       //  double discountStudentReg = basePriceRegularSize * (studentPercent);
       //  double discountStudentLarge = basePriceLargeSize * (studentPercent);
       //  double discountSeniorReg = basePriceRegularSize * (seniorPercent);
      //   double discountSeniorLarge = basePriceLargeSize * (seniorPercent);

        // get discount to reflect based on sandwich decision
        // original price * percentage = amount being taken off
        // original price - amount taken off




        // get discount percentage based on age
    //    if (age <=17 ) {
     //       basePriceRegularSize = basePriceRegularSize - basePriceRegularSize*.10;

     //   } else if (age >=65){
     //       basePriceRegularSize = basePriceRegularSize - basePriceRegularSize*.20; }
//
 //
     //   if (age <=17) {
       //     basePriceLargeSize = basePriceLargeSize - basePriceLargeSize*.10;}

        // else if (age >=65){
      //  basePriceLargeSize = basePriceLargeSize - basePriceLargeSize*.20;}













        }


