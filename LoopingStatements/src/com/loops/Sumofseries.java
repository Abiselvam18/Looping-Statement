package com.loops;

public class Sumofseries {
	
	public static void main(String[] args) {
		int i, n=10, s=0;
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				s=s-i;
			}else {
				s=s+i;
			}
		}
			System.out.println("sum of series="+s);
		}
	}
