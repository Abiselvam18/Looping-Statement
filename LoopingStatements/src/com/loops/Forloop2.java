package com.loops;

public class Forloop2 {

	public static void main(String[] args) {
		float s=0;
		for(int i=2;i<=10;i++) {
			if(i%2==0) {
			s=s+(float)1/i;
		}
			System.out.println("sum="+s);
		}
	}
}
