package com.gqt.corejava.ARRAYS;
import java.util.Scanner;

class ArrayOpe1{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter school count: ");
		int sch = sc.nextInt();
		System.out.println("Enter class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter student count in each class: ");
		int stu = sc.nextInt();
		arr = new String[sch][cls][stu];


		System.out.println("Array is created");
		System.out.println("-----------------");
	}
	void collectData() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) { 
				System.out.println("Inside class no: "+(j+1));
				for(int k =0;k<arr[i][j].length;k++) { 
					System.out.println("Enter the name of student no: "+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}
	void display() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "+(j+1)+ " is = " );
				for(int k =0;k<arr[i][j].length;k++) { 
					System.out.println("Enter the name of student no: "+(k+1)+"is="+arr[i][j][k]);
				}
			}
			System.out.println("-----------------");
		}
	}
}
public class threedimensionalarray {

	public static void main(String[] args) {
		ArrayOpe1 ao = new ArrayOpe1();
		ao.createArray();
		ao.collectData();
		ao.display();
	}
}






