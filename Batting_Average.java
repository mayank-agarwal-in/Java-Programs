package com.mayank;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Runs Scored: ");
        double r = in.nextDouble();

        System.out.print("Enter Number of Matches Played: ");
        double m = in.nextDouble();

        System.out.print("Enter Number of Matches he remained Not-Out: ");
        double n = in.nextDouble();

        double d = m - n;

        double bat_avg = r / d;
        System.out.println("Batting Average is "+bat_avg);
    }
}
