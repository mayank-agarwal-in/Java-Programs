package com.mayank;

import java.util.Scanner;

public class Check_Odd_Even {

    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
