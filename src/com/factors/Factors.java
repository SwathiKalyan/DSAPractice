package com.factors;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of factors:: "+ findFactors(78));
	}
	
	 public static int findFactors(long num) {
	        int cnt = 0;
	        System.out.print("Factors for number "+ num + " :: ");
	        for (int i=1;i<=Math.sqrt(num);i++){
	            if  (num%i == 0){
	                if (i == num/i) {
	                	cnt++;
	                	System.out.print(i);
	                } else {
	                	cnt += 2;
	                	System.out.print(i + " " + num/i);
	                }
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	        return cnt;
	    }

}
