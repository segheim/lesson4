package l4;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
				
		int[] A = new int[14];
		
		int j = 0;
				
		System.out.print("\nArray A: ");
		for (int i = 0; i < A.length; i++) {
			A[i] = (int)(Math.random()*900+100);
			System.out.print(A[i] + " ");
		}
						
		for (int i = 1; i < A.length; i = (i +2)) {
			if ( A[i] > 0 ) {
				j++;
			}
			
		}
		
		System.out.print("\n\nNew array B: ");
		
		int[] B = new int[j];
		
		for (int i = 0, k = 0; i < A.length; i++) {
			if ( A[i] > 0 ) {
				B[k] = A[i];
				System.out.print(B[k] + " ");
			}
			
		}
		
		int sum = 0;
								
		for (int k = 0; k < B.length; k++) {
			
			sum = B[k]*B[k] + sum;
			
		}
		
		System.out.println("\nsq.sum: " + sum);
		
	}

}
