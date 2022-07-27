//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package com.mayank;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int n = in.nextInt();

        if(willVote(n)){
            System.out.println("Yes! You are eligible to vote");
        }else{
            System.out.println("No! You are not eligible to vote");
        }
    }

    static boolean willVote(int n){
        return n>=18;
    }
}
