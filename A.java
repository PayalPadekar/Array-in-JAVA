package com.Array;

public class A {
	public static void main(String[]args){
		int a[] = { 1, 2, 3, 4, 5, 6};
		int sum = 0;
		for (int i = 0; i<a.length; i++){
			sum += a[i];
		}
		System.out.println("sum of array = "+ sum);
	}
}
    //output : sum of array = 21