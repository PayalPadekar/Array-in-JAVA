package com.Array;

public class Largrst_num {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[] = {10, 22, 4, -5, 5};
				int max = a[0];
				for(int i = 1; i < a.length; i++) {
					if(a[i] > max) {
						max = a[i];
					}
				}
				System.out.println("Largrst number is : " + max);
			}
		}

	

