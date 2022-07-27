package com.mayank;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
//        Perimeter Of Rectangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = in.nextInt();

        System.out.print("Enter Breadth: ");
        int b = in.nextInt();

        int peri = 2 * ( l + b );
        System.out.println("Perimeter is "+peri);
    }
}
