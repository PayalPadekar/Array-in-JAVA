package com.Array;

public class Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 22, 4, -5, 5};{
			int smallest = a[0];
			for(int i = 1; i < a.length; i++) {
				if(a[i] < smallest) {
					smallest = a[i];
				}
			}
			System.out.println("Smallest number is : " + smallest);
		}
	}

}
