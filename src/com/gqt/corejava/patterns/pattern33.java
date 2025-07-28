package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            char start = (char) (ch + (2 * (i - 1)));
            for (char c = start; c >= 'A'; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
//enter the size:
//6
 //         A 
   //     C B A 
     // E D C B A 
  //  G F E D C B A 
 // I H G F E D C B A 
//K J I H G F E D C B A 
