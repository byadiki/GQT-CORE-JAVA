package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");	
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i+" ");	
			}
			System.out.println();
	}
		for(int i=2;i<=n;i++) {	
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");	
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i+" ");	
			}
			System.out.println();
	}
	}

}
