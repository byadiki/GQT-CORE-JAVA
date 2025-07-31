package com.gqt.core.ARRAYCHALLENGES;
import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += a[i][j];
            }
        }

        System.out.println("Sum of upper triangle elements = " + sum);
    }
}
