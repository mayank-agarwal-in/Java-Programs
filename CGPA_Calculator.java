package com.mayank;

import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Subjects: ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject "+(i+1)+": ");
            int x = in.nextInt();
            sum = sum + x;
        }
        double c = sum / (n * 10);
        double p = c * 9.5;

        System.out.println("CGPA: "+c);
        System.out.println("Percentage: "+p);
    }
}
