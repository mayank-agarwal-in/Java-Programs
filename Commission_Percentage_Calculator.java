package com.mayank;

import java.util.Scanner;

public class Commission_Percentage_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter Commission Rate: ");
        double commission = in.nextDouble();

        double commission_percentage= (commission / amount) * 100;

        System.out.println("\nCommission percentage = "+commission_percentage);
    }
}
