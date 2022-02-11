package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public  class ArrayProgram {
	 public static void main(String[] args) {
			 int[] inputarray = {3, -1, 14, 16, 0, 2};
			 System.out.println("max is :"+max(inputarray));
			 System.out.println("max is :"+sum(inputarray));
			 System.out.println("avg is :"+average(inputarray));
		}
		 public static int max(int[] x) {
			 int temp = x[0];
			 for (int i=0;i<x.length;i++) {
				 if(temp <x[i])
					 temp=x[i];
			 }
			return temp;
		 }
		 public static int sum(int[] x) {
			 int total = 0;
			 for (int i=0;i<x.length;i++) {
				 total+=x[i];
					 
			 }
			return total;
		 }
		 public static int average(int[] x) {
			 int total = 0;
			 for (int i=0;i<x.length;i++) {
				 total+=x[i];
					 
			 }
			return total/x.length;
		 }
}
		
	
	
         


		