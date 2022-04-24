package com.basics;

import java.util.Scanner;

public class Palindrome {

	static void reverseNumberCheckPallandrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=n;
		int d, rev=0;
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n=n/10;
			}
		System.out.println("Reversed number="+rev);
		if(n1==rev) {
			System.out.println("Pallandrome");
		}else {
			System.out.println("Not a Pallandrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
