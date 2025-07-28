package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		char ch = 'A';
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");	
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch +" ");	
			}
			ch++;
			System.out.println();
	}
	}

}


//enter the size:
//5
//        A 
//      B B B 
//    C C C C C 
//  D D D D D D D 
//E E E E E E E E E 