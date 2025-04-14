package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float regSand = 5.45f;
        float largSand = 8.95f;
        float custTotal = 0.00f;

        System.out.println("--------- Sandwich Options ---------");
        System.out.printf("Regular Sandwich: $%.2f (1)\n", regSand);
        System.out.printf("Large Sandwich: $%.2f (2)\n", largSand);
        
        System.out.println("Sandwich selection (1/2): ");
        int sandChoice = scanner.nextInt();

        if (sandChoice == 1) {
            custTotal =+ regSand;
        }
        if (sandChoice == 2) {
            custTotal =+ largSand;
        }

        System.out.println("Enter your age:");
        int custAge = scanner.nextInt();

        if (custAge <= 17) {
            custTotal = (float) (custTotal * (1 - .10));
        }
        if (custAge >= 65) {
            custTotal = (float) (custTotal * (1 - .20));
        }

        System.out.printf("\nTotal: $%.2f", custTotal);
    }
}
