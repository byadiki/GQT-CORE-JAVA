package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);	
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l);	
			}
			System.out.println();
	}
	}

}
