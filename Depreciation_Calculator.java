package com.mayank;

import java.util.Scanner;

public class Depreciation_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Initial Value: ");
        double v1 = in.nextDouble();

        System.out.print("Enter Rate of Depreciation: ");
        double r = in.nextDouble();

        System.out.print("Enter Time in Years: ");
        double t = in.nextDouble();

        double depreciation = v1 * Math.pow((1-r/100), t);
        System.out.println("Depreciation = "+depreciation);
    }
}
