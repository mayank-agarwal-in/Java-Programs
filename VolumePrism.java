package com.mayank;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
//        Volume Of Prism
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = in.nextInt();

        System.out.print("Enter Breadth: ");
        int b = in.nextInt();

        System.out.print("Enter Height: ");
        int h = in.nextInt();


        double volume = 0.5 * (b * h * l);

        System.out.println("Volume is "+volume);
    }
}
