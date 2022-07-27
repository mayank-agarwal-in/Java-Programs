package com.mayank;

import java.util.Scanner;

public class PythagoreanTriplet_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(pytrip(a,b,c));
    }

    static boolean pytrip(int a, int b, int c){
        return (c*c == a*a + b*b);
    }
}
