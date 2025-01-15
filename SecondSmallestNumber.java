package com.Array;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = {10, 22, 4, -5, 5};{
			int min = a[0];
			int second = 0;
			
			for (int i = 0; i < a.length; i++) {
				
	            if (a[i] < min) {
	                second = min; 
	                min = a[i]; 
	                } 
	            else if (a[i] < second && a[i] != min) {
	                second = a[i]; 
	                }
	            }
	            System.out.println("Smallest: " + min);
	            System.out.println("Second Smallest: " + second);
	        }
	    }
}
