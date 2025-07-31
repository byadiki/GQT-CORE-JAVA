package com.gqt.core.ARRAYCHALLENGES;
import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = r - 1, left = 0, right = c - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
