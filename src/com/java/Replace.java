package com.java;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Replace {
	

    public static final void main(String[] args) {
    	String str="heyaa";
    	char[] chars = str.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	boolean repeatedChar;
    	for (int i = 0; i < chars.length; i++) {
    	    repeatedChar = false;
    	    for (int j = i + 1; j < chars.length; j++) {
    	        if (chars[i] == chars[j]) {
    	            repeatedChar = true;
    	            break;
    	        }
    	    }
    	    if (!repeatedChar) {
    	        sb.append(chars[i]);
    	    }
    	}
    	System.out.println(sb);
    }
}
