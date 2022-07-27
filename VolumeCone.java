package com.mayank;

import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = in.nextInt();

        System.out.print("Enter Radius: ");
        int r = in.nextInt();

        double pie=3.142;
        double volume = pie * (r*r) * h/3;

        System.out.println("Volume is "+volume);
    }
}
