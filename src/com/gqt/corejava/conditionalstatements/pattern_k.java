package com.gqt.corejava.conditionalstatements;

import java.util.Scanner;

public class pattern_k {

	public static void main(String[] args) {
		/**
		 * 
		 */

		/**@author yadikibhushitha
		 * @category
		 * @description 
		 */

		/**
		 * @param args
		 */
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(  j==0 || i+j==n/2 || i-j==n/2 ) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			sc.close();
		}

	}