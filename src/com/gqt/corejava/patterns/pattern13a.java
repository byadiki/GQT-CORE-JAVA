package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern13a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=n;j++) {
				System.out.print(k+"  ");
				k=k+n;
			}
			System.out.println("  ");
	   }

	}

}
//this is an example for dynamic input 