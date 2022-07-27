package com.mayank;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
//        Area Of Circle Java Program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        double pie = 3.142;
        double area = pie * r * r;

        System.out.println("Area is "+area);
    }
}
