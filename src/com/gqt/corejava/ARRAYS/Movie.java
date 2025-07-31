package com.gqt.corejava.ARRAYS;
import java.util.Scanner;

class Movie1 {
    long arr [][][];
    long investment; 
    long pre_profit ;
    long sum_revenue;
    Scanner sc = new Scanner(System.in);

    void createArray() {
    	System.out.print("Enter language count :");
    	int lan = sc.nextInt();
		System.out.println("Enter category count in each language : ");
		int cat = sc.nextInt();
		System.out.println("Enter movie count in each category : ");
		int mov = sc.nextInt();
		arr = new long[lan][cat][mov];
		System.out.println("Array is created");
		System.out.println("-----------------");
		System.out.println("enter the investement made : ");
		investment=sc.nextLong();
		System.out.println("enter the profit made in the financial year 2034-24 : ");
		pre_profit=sc.nextLong();
		System.out.println("-----------------");
    }

    void collectRevenueData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("inside language no : " +(i+1));
            for (int j = 0; j < arr[i].length;j++) {
            	System.out.println("inside category no : " +(j+1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("enter the revenue of movie no :" +(k+1));
                    arr[i][j][k] = sc.nextLong();
                    sum_revenue += arr [i][j][k];
                }
            }
            System.out.println("Data collected&calculated");
    		System.out.println("-----------------");
        }
    }

    void displayRevenue() {
    	for (int i = 0; i < arr.length; i++) {
            System.out.println("inside language no : " +(i+1));
            for (int j = 0; j < arr[i].length;j++) {
            	System.out.println("inside category no : " +(j+1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("enter the revenue of movie no :" +(k+1)+"is ="+arr[i][j][k]);
                }
            }
        }
		System.out.println("-----------------");
		System.out.println("Overall revenue: "+sum_revenue);
		System.out.println("-----------------");

        if (sum_revenue>investment) {
            long profit=(sum_revenue-investment);
            System.out.println("The profit made by Hemant is :"+profit);
            if (profit>pre_profit) {
                System.out.println("Hemanth had made more profit than previous year");
            }
        } else {
            System.out.println("The loss incured by Hemanth is = : "+(investment-sum_revenue));
        }
    }
}

public class Movie {
    public static void main(String[] args) {
        Movie1 mr = new Movie1();
        mr.createArray();
        mr.collectRevenueData();
        mr.displayRevenue();
    }
}