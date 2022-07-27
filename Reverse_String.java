package com.mayank;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String to be reversed: ");
        String s = in.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.trim().charAt(i);
            str = ch + str;
        }
        System.out.println("\nReversed String is "+str);
    }
}
