package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=i+20;j=j+5) {
				System.out.print(j+"  ");
			}
			System.out.println("  ");
	}
	}

}
