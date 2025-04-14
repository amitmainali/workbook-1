package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float rentCost = 29.99f;
        float underAgeCost = .30f;
        float tollTagCost = 3.95f;
        float gpsCost = 2.95f;
        float roadsideCost = 3.95f;

        System.out.println("-------- Car Rentals --------");
        System.out.println("What date are you picking up?");
        String pickDate = scanner.nextLine();

        System.out.println("How many days are you renting the car?");
        int numDays = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Do you want an electronic toll tag at $3.95/day (yes/no)?");
        String tollTagChoice = scanner.nextLine();

        System.out.println("Do you want a GPS at $2.95/day (yes/no)?");
        String gpsChoice = scanner.nextLine();

        System.out.println("Do you want roadside assistance at $3.95/day (yes/no)?");
        String roadsideChoice = scanner.nextLine();

        System.out.println("What is your current age?");
        int currentAge = scanner.nextInt();

        float carTotal = rentCost * numDays;
        float optionsTotal = 0.00f;
        float surcharge = 0.00f;

        System.out.println("-------- Rental Receipt --------");

        System.out.printf("\nBasic Car Rental: $%.2f", carTotal);

        if (Objects.equals(tollTagChoice, "yes")) {
            optionsTotal =+ tollTagCost * numDays;
        }
        if (Objects.equals(gpsChoice, "yes")) {
            optionsTotal =+ gpsCost * numDays;
        }
        if (Objects.equals(roadsideChoice, "yes")) {
            optionsTotal =+ roadsideCost * numDays;
        }

        System.out.printf("\nOptions Cost: $%.2f", optionsTotal);

        if (currentAge < 25) {
            surcharge = carTotal * (underAgeCost);
        }

        System.out.printf("\nUnderage Driver Surcharge: $%.2f", surcharge);

        System.out.printf("\nTotal Cost: $%.2f", (surcharge + carTotal + optionsTotal));

    }
}