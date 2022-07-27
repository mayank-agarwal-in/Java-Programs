package com.mayank;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
//        Volume Of Sphere
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = in.nextInt();

        double pie=3.142;
        double volume = 4 * pie * (r*r*r) / 3;

        System.out.println("Volume is "+volume);
    }
}
