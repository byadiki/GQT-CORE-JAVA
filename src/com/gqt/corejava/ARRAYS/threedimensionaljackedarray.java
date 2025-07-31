package com.gqt.corejava.ARRAYS;
import java.util.Scanner;

class ArrayOpe2{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter school count: ");
		int sch = sc.nextInt();
		//System.out.println("Enter class count: ");
		//int cls = sc.nextInt();
		//System.out.println("Enter student count in each class: ");
		//int stu = sc.nextInt();
	    arr = new String[sch][][];
	    //collect student count
	    for (int i =0;i<arr.length;i++) {
			System.out.println("enter the class count inside the school no: "+(i+1));
			arr[i]=new String[sc.nextInt()][];
	    }
	    //collect student count
	    for (int i =0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) { 
				System.out.println("enter the student count inside class no: "+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
	    }

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
public class threedimensionaljackedarray {

	public static void main(String[] args) {
		ArrayOpe2 ao = new ArrayOpe2();
		ao.createArray();
		ao.collectData();
		ao.display();
	}
}






