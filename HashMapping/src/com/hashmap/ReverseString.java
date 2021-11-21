package com.hashmap;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scan= new Scanner(System.in);
		String name=scan.next();
		String naam=reverse(name);	
		System.out.println(naam);
	}

	private static String reverse(String name) {
		
		StringBuilder sb= new StringBuilder();
		int length=name.length();
		for(int i=length-1;i>=0;i--) {
			sb.append(name.charAt(i));
			
		}
		
		return sb.toString();
		
	}
}
