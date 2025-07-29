package com.gqt.corejava.Name;

import java.util.Scanner;

public class name {

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
						if( (i==0 && j!=n-1) ||(j==n-1 && i!=0 && i!=n-1 && i!=n/2) || j==0 ||   //B
								((i==n-1) && j!=n-1) || (i==n/2 && j!=n-1)  ) {
							System.out.print("# ");
						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if(  j==0 || j==(n-1) || i==n/2 ) {            //H
							System.out.print("# ");

						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if(  j==0 || j==(n-1) || i==(n-1))   {     //U
							System.out.print("# ");
						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if(  (j==0 && i<=n/2) || i==0 || (j==(n-1) && i>=n/2) || i==(n-1) || i==n/2)   {  //S
							System.out.print("# ");
						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if(  j==0 || j==(n-1) || i==n/2 ) {            //H
							System.out.print("# ");

						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if( i==0 || i==(n-1) || j==n/2  ) {       //I
							System.out.print("# ");

						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if( i==0 || j==n/2  ) {
							System.out.print("# ");            //T

						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if(  j==0 || j==(n-1) || i==n/2 ) {            //H
							System.out.print("# ");

						}else {
							System.out.print("  ");
						}
				}
				System.out.print("		");
					for(int j=0; j<n; j++) {
						if((j==0 && i>=n/2) || i+j==n/2 || j-i==n/2 || (j==n-1 && i>=n/2) || i==n/2) {    //A
							System.out.print("# ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}

		}
