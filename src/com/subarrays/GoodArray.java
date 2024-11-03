package com.subarrays;

public class GoodArray {

	public static void main(String[] args) {
		int [] A = {1,2,3,4,5};
		int B = 4;
		int  cnt = 0;
        for (int i=0; i<A.length;i++){
            int sum = 0;
            for (int j=i;j<A.length;j++){
                sum += A[j];
                if ((i+j)%2==0){
                    if (sum > B){
                        cnt++;
                    }
                } else {
                    if (sum < B){
                        cnt++;
                    } 
                }
            }
        } 
       	System.out.println(cnt);

	}

}
