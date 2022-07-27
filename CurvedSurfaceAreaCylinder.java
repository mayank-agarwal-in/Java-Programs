package com.mayank;

import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = in.nextDouble();

        System.out.print("Enter Height: ");
        double h = in.nextDouble();

        double pie=3.142;
        double CSA = 2 * pie * r * h;

        System.out.println("CSA of Cylinder is "+ CSA);
    }
}
