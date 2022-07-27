package com.mayank;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println("Hello "+ name);
    }
}
