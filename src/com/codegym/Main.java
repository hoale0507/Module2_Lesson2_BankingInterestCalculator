package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money, interestRate;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount:");
        money = input.nextDouble();
        System.out.println("Enter the month");
        month = input.nextInt();
        System.out.println("Enter the rate");
        interestRate = input.nextDouble();
        double interest = 0;
        for(int i = 0; i < month; i++){
            interest += money * interestRate/12 * month;
        }
        System.out.println("Total interest is " + interest);
    }
}
