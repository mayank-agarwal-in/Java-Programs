package com.mayank;

import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side length of Cube: ");
        double s = in.nextDouble();

        double TSA = 6 * s * s;
        System.out.println("Total Surface Area of Cube is "+TSA);
    }
}
