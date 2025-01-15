package com.Array;

public class SquareInSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 9};
		
		for (int i = 0; i < a.length; i++){
			int sqRes = a[i] * a[i];
			
			for (int j = 0; j < a.length; j++){
				if(sqRes == a[j]) {
					System.out.println(a[i]);
					break;
				}
		   }
	  }
  }
}
