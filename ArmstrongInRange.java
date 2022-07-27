package com.mayank;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum==original;
    }
}
