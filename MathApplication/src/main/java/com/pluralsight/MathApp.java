package com.pluralsight;

public class MathApp {

    public static void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //Question 1:
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The answer is " + highestSalary);

        ///////////////////////
        // Question 2:

        double carPrice = 12000;
        double truckPrice = 34000;
        double smallestPrice;
        smallestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The smallest price is " + smallestPrice);

        //////////////////////
        // Question 3:
        System.out.println("Find and display the area of a circle whose radius is 7.25");

        double circleRadius = 7.25f;
        double pi = 3.14156f;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);

        circleArea= pi +(Math.pow(circleRadius, 2));
        System.out.println("The answer is: the circle area is " + circleArea);

        /////////////////
        // Question 4
        System.out.println("Find and display the square root of a variable after it is set to 5.0");
        double number = 5;
        double squareRoot = Math.sqrt(number);

        System.out.println("The answer is " + squareRoot);

        ////////////////
        // Question 5
        System.out.println("Find and display the distance between the points (5, 10) and (85, 50)");

        // use the distance formula
        // d = √(x2 - x1)2 + (y2 - y1)2
        //d = Sqrt(85 - 5)^2 + (50 - 10)^2
        //
        //d = Sqrt( (85 - 5)^2 + (50 - 10)^2 )
        //d = Sqrt( (80)^2 + (40)^2 )
        //d = Sqrt( 6400 + 1600 )
        //d = Sqrt (8000 )
        //d = 89.4

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt( ( Math.pow(x2- x1, 2) ) + Math.pow(y2- y1, 2) );

        System.out.println("The answer is " + distance);

        ///////////////
        // Question 6
        System.out.println("Find and display the absolute (positive) value of a variable after it is set to -3.8");
        double number2 = -3.8;
        double answer6 = Math.abs(number2);

        System.out.println("The answer is " + answer6);

        /////////////
        // Question 7
        System.out.println("Find and display a random number between 0 and 1");
        double randomnumber = Math.random();

        System.out.println("The answer is " + randomnumber);


        ////////
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f" , name, id, pay);



    }
}
