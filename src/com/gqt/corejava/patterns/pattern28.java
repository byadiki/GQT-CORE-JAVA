package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");	
			}
			for(int j=1;j<=1;j++) {
                System.out.print(i + " ");
            }
			for(int j=1;j<=2*(i-1)-1;j++) {
                System.out.print("  ");
            }
			for (int j=1;j<=(i-1);j=j+(i-1)) {
                System.out.print(i + " ");
            }
			System.out.println();
	}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");	
			}
			for(int j=1;j<=1;j++) {
                System.out.print(i + " ");
            }
			for(int j=1;j<=2*(i-1)-1;j++) {
                System.out.print("  ");
            }
			for (int j=1;j<=(i-1);j=j+(i-1)) {
                System.out.print(i + " ");
            }
			System.out.println();
	}
  }
}
/*
 * enter the size:
8
              1 
            2   2 
          3       3 
        4           4 
      5               5 
    6                   6 
  7                       7 
8                           8 
  7                       7 
    6                   6 
      5               5 
        4           4 
          3       3 
            2   2 
              1 

 */
