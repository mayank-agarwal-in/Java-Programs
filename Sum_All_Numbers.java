package com.mayank;

import java.util.Scanner;

public class Sum_All_Numbers {
    public static void main(String[] args) {
        int num=1,sum=0;

        System.out.println("Enter numbers: ");
        while (num != 0){
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            sum+=num;
        }

        System.out.print("Sum is: "+sum);

    }
}
