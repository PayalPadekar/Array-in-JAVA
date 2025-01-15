package com.Array;

public class reverse_Array {
	public static void main(String[]args) {
		int a[] = {10, 44, 21, 4, 17, 58, 32};{
			int b[] = new int[a.length];
			for(int i = a.length - 1, k = 0; i >= 0; i--, k++) {
				b[k] = a[i];
			}
			System.out.println("Print");
			for(int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
	}

}
