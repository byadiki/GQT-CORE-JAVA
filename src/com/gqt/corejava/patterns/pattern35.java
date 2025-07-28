package com.gqt.corejava.patterns;

import java.util.Scanner;
public class pattern35 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i - 1); s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.print("A ");
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }
    }
}


//enter the size:
//5
//        A 
//      B A B 
//    C B A B C 
//  D C B A B C D 
//E D C B A B C D E 