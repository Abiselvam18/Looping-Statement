package com.basics;

public class VowelsConsonents {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		
		String str="Edubridge India";
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)!=' '){
				cCount++;
			}
		}
		System.out.println("vowels:"+vCount);
		System.out.println("Consonents:"+cCount);
	}

}