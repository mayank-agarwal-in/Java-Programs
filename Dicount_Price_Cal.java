package com.mayank;

import java.util.Scanner;

public class Dicount_Price_Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter MRP: ");
        float original_price = in.nextFloat();
        System.out.print("Enter Discount Rate in %: ");
        int discount = in.nextInt();
        float discounted_price = original_price - (original_price * discount / 100);
        System.out.println("Final Price is Rs. "+discounted_price);
    }
}
