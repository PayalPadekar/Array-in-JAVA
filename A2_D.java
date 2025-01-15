package com.Array;

public class A2_D {
	public static void main (String[]args) {
		int a [][] = {
				{1,2,3,4},
				{11,22,33,44},
				{111,222,333,444}
		};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
    }
}

