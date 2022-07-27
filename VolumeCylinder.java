package com.mayank;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
//        Volume Of Cylinder
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = in.nextInt();

        System.out.print("Enter Height: ");
        int h = in.nextInt();

        double pie=3.142;
        double volume = pie * (r*r) * h;

        System.out.println("Volume is "+volume);
    }
}
