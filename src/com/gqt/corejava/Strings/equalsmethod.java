package com.gqt.corejava.Strings;

public class equalsmethod {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		System.out.println("Case-1 : Same Strings");
		if(s1.equals(s2)==true) {
			System.out.println("Strings equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("--------------------------");
		if(s1.equals(s2)==true) {
			System.out.println("References equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("=================================");
		System.out.println("Case-2 : Different Strings");
		if(s1.equals(s4)==true) {
			System.out.println("Strings equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("--------------------------");
		if(s1.equals(s4)==true) {
			System.out.println("References equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("================================");
		System.out.println("Case-3 : Same Strings different case");
		if(s1.equals(s3)==true) {
			System.out.println("Strings equal");
		}
		else {
			System.out.println("Steings are not equal");
		}
		System.out.println("--------------------------");
		if(s1.equals(s3)==true) {
			System.out.println("References equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("--------------------------");
	}

}
