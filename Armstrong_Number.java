package com.mayank;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int original = n;
        int sum = 0;
        while (n!=0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n /= 10;
        }

        if (sum == original){
            System.out.println(original + " is an Armstrong Number");
        }else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
