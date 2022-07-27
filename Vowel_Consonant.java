package com.mayank;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character: ");
        String s = in.next();
        char ch = s.trim().charAt(0);
        if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
