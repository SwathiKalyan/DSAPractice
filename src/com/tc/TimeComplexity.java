package com.tc;

public class TimeComplexity {
	public static void main(String args[]) {
		int a =0; int i = 32;
		while (i > 0) {
			a = a+i;
			i /=2;
			System.out.print(i + " ");
		}
//		System.out.println(a);
	}

}
