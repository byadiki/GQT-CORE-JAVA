package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt(); 
		for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
 * enter the size:
5
        0 
      1 0 1 
    2 1 0 1 2 
  3 2 1 0 1 2 3 
4 3 2 1 0 1 2 3 4 
 */
