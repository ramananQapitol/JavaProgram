package com.java;

public class NumbertoChar {
	
	public static void main(String[] args){
		String s="10#11#12";
		char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] input = s.toCharArray();
	
	StringBuilder sb= new StringBuilder(input.length);
	int i=0;
	while(i<input.length) {
		if(i<input.length-2 && input[i+2]=='#') {
			int numericValue2 = Character.getNumericValue(input[i])*10;
			int numericValue = Character.getNumericValue(input[i+1]);
			int countNum= numericValue+numericValue2;
			char c = alpha[countNum-1];
			sb.append(c);
			i=i+3;
		}
		else {
			int num = Character.getNumericValue(input[i]);
			char c = alpha[num-1];
			sb.append(c);
			i++;
		}
	}
	System.out.println(sb.toString());
	}
	
	}

