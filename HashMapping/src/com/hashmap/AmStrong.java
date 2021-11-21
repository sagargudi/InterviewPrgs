package com.hashmap;

public class AmStrong {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
		int r=0;
		int sum=0;
		
		while(number>0)
		{
			 r=number%10;
			number=number/10;
			sum=sum+r*r*r;
			
		}
		
		if(temp==sum) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not a Amstrong");
		}
	}
	
}
