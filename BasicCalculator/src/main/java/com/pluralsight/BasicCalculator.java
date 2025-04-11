package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float firstNum = input.nextFloat();
        System.out.println("Enter the second number: ");
        float secondNum = input.nextFloat();

        System.out.println("Possible calculations:");
        System.out.println("\t(A)dd\n" + "\t(S)ubtract\n" + "\t(M)ultiply\n" + "\t(D)ivide");
        System.out.println("Please select an option: ");
        String choice = input.next();


        if (choice.equalsIgnoreCase("A")) {
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        }
        if (choice.equalsIgnoreCase("S")) {
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
    }
        if (choice.equalsIgnoreCase("M")) {
            System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
}
        if (choice.equalsIgnoreCase("D")) {
            System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
        }
        }
    }