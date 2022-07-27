package com.mayank;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int n = in.nextInt();

        if ( (n%4 == 0 && n%100 != 0) || (n%400 == 0)){
            System.out.println(n+" is a leap year");
        }else {
            System.out.println(n+" is not a leap year");
        }
    }
}
