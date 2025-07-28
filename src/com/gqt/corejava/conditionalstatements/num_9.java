package com.gqt.corejava.conditionalstatements;

import java.util.Scanner;

public class num_9 {

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
						if( i==0 || i==n/2 || i==n-1 || (j==0 && i<n/2) || j==n-1  )  {
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