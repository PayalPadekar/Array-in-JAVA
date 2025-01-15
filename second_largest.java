package com.Array;

public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = {10, 22, 4, -5, 5};{
			int max = a[0];
			int second = 0;
			
			for (int i = 0; i < a.length; i++) {
				
	            if (a[i] > max) {
	                second = max; 
	                max = a[i]; 
	                } 
	            else if (a[i] > second && a[i] != max) {
	                second = a[i]; 
	                }
	            }
	            System.out.println("Largest: " + max);
	            System.out.println("Second Largest: " + second);
	        }
	    }
	}




