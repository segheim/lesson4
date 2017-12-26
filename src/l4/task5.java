package l4;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N array's NxN: ");
		int n = sc.nextInt();
		
		int[][] array = new int[n][n];
		
			
			for( int i = 0; i < array.length; i++ ) {
				for ( int j = 0; j < array[i].length; j++) {
					array[i][j] = (int)(Math.random()*900);
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			
						
			for ( int j = 0; j < array.length; j++) {
				
				for (int  i = 0; i < array[j].length; i++) {
					if ( array[i][j] > max) {
						max = array[i][j];
											
					}
									
				}
				System.out.println("Max in " + (j +1) + " colomn's array: " + max);				
				
			}
						
	}

}
