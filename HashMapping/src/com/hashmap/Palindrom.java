package com.hashmap;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner scan= new Scanner(System.in);
		int number= scan.nextInt();
		int temp=number;
		int sum=0;
		int r=0;
		
		while(number>0) {
			 r=number%10;
			 number=number/10;
			sum=sum*10+r;
		}
		if(temp==sum) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
