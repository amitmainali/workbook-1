package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question #1

        double bobSalary = 20000;
        double garySalary = 40000;
        double highestSalary = Math.max(bobSalary, garySalary);


        System.out.printf("The highest salary is: $" + "%.2f\n", highestSalary);

        // Question 2

        double carPrice = 30000;
        double truckPrice = 120000;

        if (carPrice > truckPrice) {
            System.out.printf("The truck costs less and is $" + "%.2f\n", truckPrice);
        } else {
            System.out.printf("The car costs less and is $" + "%.2f\n", carPrice);
        }

        // Question 3

        double radius = 7.25;
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is " + area);

        // Question 4

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is " + squareRoot);

        // Question 5

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is " + distance);

        // Exercise 6

        double absValue = -3.8;
        double absoluteValue = Math.abs(absValue);

        System.out.println("The absolute value is " + absoluteValue);

        // Exercise 7

        double randomNumber = Math.random();

        System.out.println("The random number is " + randomNumber);

    }
}