package com.mayank;


//Lets assume
//1 to 100 units   – Rs. 10/unit
//100 to 200 units – Rs. 15/unit
//200 to 300 units – Rs. 20/unit
//above 300 units  – Rs. 25/unit

import java.util.Scanner;

public class Electricity_Bill_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Unit(s) Spend: ");
        int n = input.nextInt();

        int bill = 0;
        if (n>=1 && n<=100){
            bill = 10 * n;
        } else if (n>100 && n<=200) {
            bill = 10 * 100 + 15 * (n-100);
        } else if (n>200 && n<=300) {
            bill = 10 * 100 + 15 * 100 + 20 * (n-200);
        } else if (n>300) {
            bill = 10 * 100 + 15 * 100 + 20 * 100 + 25 * (n-300);
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("Your Electricity Bill is "+bill);
    }
}
