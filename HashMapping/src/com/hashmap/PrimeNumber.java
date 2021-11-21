package com.hashmap;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp=0;
		for(int i=2;i<=100;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp++;
				}
				
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
			else {
				temp=0;
			}
		}
		}
		
}
