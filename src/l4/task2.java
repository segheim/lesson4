package l4;

public class task2 {

	public static void main(String[] args) {
				
		double a[] = {1, 5, -10, 20, -30, 100};
		double max = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if (max < a[i]) 
			max = a[i];
			System.out.print(a[i] + " ");

	}
		System.out.println("\nMax number: " + max);
		
		for ( int i=0; i < a.length; i++) {			
			a[i] = a[i]/max;	
			System.out.print( a[i] + " ");
			
		}
		
	}
	}
