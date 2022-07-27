package com.mayank;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
//        Area Of Isosceles Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of Same Side: ");
        int a = in.nextInt();

        System.out.print("Enter Base Side: ");
        int b = in.nextInt();

        double area = (b * sqrt((4*a*a) - (b*b)) ) / 4;

        System.out.println("Area is "+area);
    }
}
