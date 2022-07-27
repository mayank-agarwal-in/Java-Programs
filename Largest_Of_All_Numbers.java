package com.mayank;

import java.util.Scanner;

public class Largest_Of_All_Numbers {
    public static void main(String[] args) {
        int num = 1,largest=0;
        System.out.println("Enter Numbers: ");
        while (num != 0){
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num > largest){
                largest = num;
            }
        }
        System.out.println("Largest Number is "+largest);
    }
}
