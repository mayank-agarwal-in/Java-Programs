package com.mayank;

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
//        Volume Of Pyramid
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = in.nextInt();

        System.out.print("Enter Breadth: ");
        int b = in.nextInt();

        System.out.print("Enter Height: ");
        int h = in.nextInt();

        double volume = (l*b*h) / 3;

        System.out.println("Volume is "+volume);
    }
}
