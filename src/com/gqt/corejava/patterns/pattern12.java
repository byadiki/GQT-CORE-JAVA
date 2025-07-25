package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=25;
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+"  ");
				k--;
			}
			System.out.println("  ");
	   }

	}

}
//this program is for static i.e.., we are defining value
