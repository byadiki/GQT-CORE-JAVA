package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=1-k;
				
			}
			System.out.println();

	}

  }
}
