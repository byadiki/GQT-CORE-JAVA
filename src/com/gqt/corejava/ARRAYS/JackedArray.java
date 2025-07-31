package com.gqt.corejava.ARRAYS;
import java.util.Scanner;

class arrayoperation1{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter class count: ");
		int cls = sc.nextInt();
		arr = new String[cls][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the count of students inside the class no: "+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
		System.out.println("Array is created");
		System.out.println("-----------------");
	}
	void collectData() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) { 
				System.out.println("Enter the name of student no: "+(j+1));
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}
	void display() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no: "+(j+1)+ " is = " +arr[i][j]);
			}
		}
	}
}
public class JackedArray {

	public static void main(String[] args) {
		arrayoperation1 ao = new arrayoperation1();
		ao.createArray();
		ao.collectData();
		ao.display();
	}

}
