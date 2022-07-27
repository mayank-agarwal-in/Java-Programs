package com.mayank;

import java.util.Scanner;

public class Average_Marks {
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
        double avg = sum / n;

        System.out.println("Average Marks: "+avg);
    }
}
