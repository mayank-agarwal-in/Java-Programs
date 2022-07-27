package com.mayank;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
//        Area Of Rectangle Program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = in.nextInt();

        System.out.print("Enter Breadth: ");
        int b = in.nextInt();

        int area = l * b;
        System.out.println("Area is "+area);
    }
}
