package com.Array;

public class Dublicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 25, 9, 5, 2, 36, 9, 15};
		
		for(int i = 0; i < a.length; i++){
			int res = a[i];
			
			for(int j = 0; j < a.length; j++) {
				if(res == a[j] && i != j && a[i] != 0) {
					System.out.println(a[i]);
					a[j] = 0;
					break;
				}
			}
		}
	}

}
