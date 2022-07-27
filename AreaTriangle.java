package com.mayank;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
//        Area Of Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = in.nextInt();

        System.out.print("Enter Height: ");
        int h = in.nextInt();

        double area = 0.5 * b * h;
        System.out.println("Area is: "+area);
    }
}
