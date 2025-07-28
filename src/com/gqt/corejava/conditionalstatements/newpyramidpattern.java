package com.gqt.corejava.conditionalstatements;

import java.util.Scanner;
/*
 * - - - - - $ 
   - - - - $ $ $ 
   - - - $ $ $ $ $ 
   - - $ $ $ $ $ $ $ 
   - $ $ $ $ $ $ $ $ $ 
 */
/**
 * @author yadikibhushitha
 * @category patterns
 * @description This is an example of pyramid program
 */

public class newpyramidpattern {
/**
 * @description This contain source code for the pyramid
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
