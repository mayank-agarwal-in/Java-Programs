package com.mayank;

import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
//        Perimeter Of Rhombus
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int a = in.nextInt();

        int peri = 4 * a;
        System.out.println("Perimeter is "+peri);
    }
}
