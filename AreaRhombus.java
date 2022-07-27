package com.mayank;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
//        Area Of Rhombus
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of Diagonal 1: ");
        int d1 = in.nextInt();

        System.out.print("Enter length of Diagonal 2: ");
        int d2 = in.nextInt();

        double area = (d1 * d2)/2;
        System.out.println("Area is "+area);
    }
}
