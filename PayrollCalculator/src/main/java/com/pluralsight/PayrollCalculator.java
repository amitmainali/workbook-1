package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Full Name: ");
        String fullName = input.nextLine();

        System.out.println("Hours Worked Weekly: ");
        float hoursWorked = input.nextFloat();

        System.out.println("Pay Rate: ");
        float payRate = input.nextFloat();

        float overtimeHours = hoursWorked - 40;
        float overtimePay = (float) (payRate * 1.5);
        float grossPay = 0;


        if (hoursWorked < 40) {
            grossPay = hoursWorked * payRate;
        }
        else {
            grossPay = (40 * payRate) + (overtimeHours * overtimePay);
        }
        System.out.printf(fullName + "'s weekly gross pay is $%.2f", + grossPay);

    }
}