package com.Array;

public class SquareInAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6};
		int b[] = { 2, 25, 9, 25, 36, 15};
		
		for (int i = 0; i < a.length; i++){
			int sqRes = a[i] * a[i];
			
			for (int j = 0; j < b.length; j++)
				if(sqRes == b[j]) {
					System.out.println(a[i]);
					break;
	            }
		}
   }
}

