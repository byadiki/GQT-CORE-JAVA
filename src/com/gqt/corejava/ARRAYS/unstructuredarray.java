package com.gqt.corejava.ARRAYS;

import java.util.Scanner;
public class unstructuredarray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the student count: ");
			int n=sc.nextInt();
			//creating the array to store the n students marks 
			int arr[]=new int[n];
			//collecting and storing marks of n students
			for(int i=0;i<arr.length;i++) {
				System.out.println("enter the marks of students no:"+(i+1));
				arr[i]=sc.nextInt();
			}
			System.out.println("---------------");
			//Display marks stored inside the array 
			for(int i=0;i<arr.length;i++) {
				System.out.println("The marks of students no:"+(i+1)+" is = "+arr[i]);
			}
		}

	}