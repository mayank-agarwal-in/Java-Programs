package com.mayank;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaEquiTriangle {
    public static void main(String[] args) {
//        Area Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of Side: ");
        int a = in.nextInt();

        double area = (sqrt(3) / 4) * a * a;

        System.out.println("Area is "+area);
    }
}
