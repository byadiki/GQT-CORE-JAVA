package com.gqt.corejava.ARRAYS;
import java.util.Scanner;

class ArrayOpe4 {
	String[][][] arr;
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.println("Enter the number of colleges:");
		int col = sc.nextInt();
		arr = new String[col][][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number of classes in college no: " + (i + 1));
			int cls = sc.nextInt();
			arr[i] = new String[cls][];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside college no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the number of students in class no: " + (j + 1));
				int stu = sc.nextInt();
				arr[i][j] = new String[stu];
			}
		}

		System.out.println("Array is created");
		System.out.println("-----------------");
	}

	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside college no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class no: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the name of student no: " + (k + 1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}

	void display() {
		long totalRevenue = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside college no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class no: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Student no: " + (k + 1) + " is = " + arr[i][j][k]);
					if (i == 0) {
						totalRevenue += 2500000;
					} else if (i == 1) {
						totalRevenue += 350000;
					} else if (i == 2) {
						totalRevenue += 80000;
					}
				}
			}
			System.out.println("-----------------");
		}
		System.out.println("Total Revenue for 2024-2025: ₹" + totalRevenue);
	}
}

public class swathi {
	public static void main(String[] args) {
		ArrayOpe4 ao = new ArrayOpe4();
		ao.createArray();
		ao.collectData();
		ao.display();
	}
}
