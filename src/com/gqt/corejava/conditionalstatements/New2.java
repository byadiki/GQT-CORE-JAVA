package com.gqt.corejava.conditionalstatements;
import java.util.Scanner;
/*
 * #  
   #  #  
   #  -  #  
   #  -  -  #  
   #  #  #  #  #
 */

/**
 * @author yadikibhushitha
 * @category patterns
 * @description This is an example of pattern program
 */
public class New2 {
	/**
	 * @description This contain source code for the pattern
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0 || i==(n-1) || j==0 || j==i){
					System.out.print("#  ");
				}
				else {
					System.out.print("-  ");
				}
			}
			System.out.println();
		}

	}

}
