package l4;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		
		int a = 8;
		int b = 5;
		int[] buf = null;
		
		int A[][] = {	{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, 
				{21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}	};
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
		System.out.print( A[i][j] + " " );
		}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What lines to cange: ");
		int k = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int p = sc1.nextInt();
		
		k--;
		p--;
	
		
		for (int i = 0; i < a; i++) {
			if ( i == k) {
				buf = A[k];
				A[k] = A[p];
					
			}
				if ( i == p) {				
				A[p] = buf;
			}
			
			for (int j = 0; j < b; j++) {				
		System.out.print( A[i][j] + " " );
		}
			System.out.println();
		}
		
		
		
		
	}

}
