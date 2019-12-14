
public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("\t----Bubble Sort-----");
		int temp =0;
		int i;
		int array[] = {71,43,91,64,72,59,10,85,30};
	    int n= array.length;
	    
	    for (int j = 0; j < n-1; j++) {
	    	for(i=0 ; i < n-1 ; i++ ) {
			
				if (array[i] > array[i+1]) { 
					temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}	
		}
	    System.out.print("Ascending Order:");
	    for (int j : array) {
	    	System.out.print(j+" ");
		}
	    
	    System.out.print("\nDescending Order:");
	    for (int j = n-1 ; j > 0; j--) {
			
	    	System.out.print(array[j]+" ");
	    }	
	}
}