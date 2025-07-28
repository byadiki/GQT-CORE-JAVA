package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<i;j++) {
                System.out.print((char) ('A'+j));
            }
			for(int j=0;j<i-1;j++) {
                System.out.print((char) ('A'+j));
            }
			System.out.println();
	}
	}

}


//enter the size:
//5
//    A
//   ABA
//  ABCAB
// ABCDABC
//ABCDEABCD