package com.mayank;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
//        Perimeter Of Circle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        double pie = 3.142;
        double peri = 2 * pie * r;

        System.out.println("Perimeter is "+peri);
    }
}
