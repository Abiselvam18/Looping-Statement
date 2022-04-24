package com.basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153, originalNum, remainder, res=0;
		originalNum=num;
		while(originalNum!=0) {
			remainder=originalNum%10;
			res+=Math.pow(remainder, 3);
			originalNum/=10;
		}
		if(res==num)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not armstrong number");
	}
}
