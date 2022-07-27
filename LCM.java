package com.mayank;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int max;

        if (n1>n2) max = n1;
        else max = n1;

        int lcm = Integer.MIN_VALUE;

        while (true){ //i<36
            if (max%n1 == 0 && max%n2==0){
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("LCM = "+lcm);
    }
}
