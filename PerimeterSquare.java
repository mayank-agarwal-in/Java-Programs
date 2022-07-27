package com.mayank;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
//        Perimeter Of Square
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int a = in.nextInt();

        int peri = 4 * a;
        System.out.println("Perimeter is "+peri);
    }
}
