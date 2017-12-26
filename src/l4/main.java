package l4;

public class main {

	public static void main(String[] args) {
		
		int imin = 0;
		int imax = 0;		
		
		double array[] = {3.4, 56.3, 76, 34.3, 6.3, 2.2, 1.5};
		
		double max = array[0];
		double min = array[0];
				
		for (int i=1; i < array.length; i++){
		
			if (array[i] > max) {
			  imax = i;
			  max = array[i];
		}
			if (array[i] < min) {
			imin = i;
			min = array[i];
		}
		
		}
		
		array[imin] = max;
		array[imax] = min;			
							
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
				
			
	
	
		
	}
}
