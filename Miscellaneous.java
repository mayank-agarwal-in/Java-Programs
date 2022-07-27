package com.mayank;

//Q. Write a program to print the sum of negative numbers,
//   sum of positive even numbers and the sum of positive odd numbers
//   from a list of numbers (N) entered by the user.
//   The list terminates when the user enters a zero.

import java.util.Scanner;

public class Miscellaneous {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negsum = 0, evensum = 0, oddsum = 0;
        System.out.println("Start Entering Numbers: ");

        while (true){
            int n = in.nextInt();

            if (n<0){
                negsum += n;
            } else if (n>0) {
                if (n%2==0){
                    evensum += n;
                }else {
                    oddsum += n;
                }
            } else if (n==0) {
                break;
            }
        }

        System.out.println("\nSum of negative numbers = "+negsum);
        System.out.println("Sum of positive even numbers = "+evensum);
        System.out.println("Sum of positive odd numbers = "+oddsum);
    }
}
