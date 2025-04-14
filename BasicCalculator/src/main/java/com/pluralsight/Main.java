package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the first number?");
    double firstnumber = scanner.nextInt();

    System.out.println("What is the second number?");
    double secondnumber = scanner.nextInt();

 ///  only pick multiplication on this step
    // Possible calculations:
    // (A)dd
    // (S)ubtract
    // (M)ultiply
    // (D)ivide
    //Please select an option: M
    double product = firstnumber + secondnumber;

    System.out.printf( "The product of %.2f and %.2f is %.2f ", firstnumber, secondnumber, product);


}
}
