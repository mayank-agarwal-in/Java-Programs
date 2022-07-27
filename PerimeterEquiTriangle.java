package com.mayank;

import java.util.Scanner;

public class PerimeterEquiTriangle {
    public static void main(String[] args) {
//        Perimeter Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int a = in.nextInt();

        int peri = 3 * a;

        System.out.println("Perimeter is "+peri);
    }
}
