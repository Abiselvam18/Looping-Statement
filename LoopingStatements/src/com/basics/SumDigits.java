package com.basics;

import java.util.Scanner;

public class SumDigits {
	static void sumDigits() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int d, s=0;
	while(n!=0) {
		d=n%10;
		s=s+d;
		n=n/10;
	}
	System.out.println("sum of digits" +s);
}
	public static void main(String[] args) {
		SumDigits.sumDigits();
	}
}
