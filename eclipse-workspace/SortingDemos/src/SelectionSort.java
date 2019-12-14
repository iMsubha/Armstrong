
public class SelectionSort {

	public static void main(String[] args) {
		int array[]= {6,1,7,8,9,3,5,4,2};
		int n=array.length;
		int temp=0;
		
			for (int i = 0; i < n-1 ; i++) {
				for (int j = i+1; j < n-1; j++) {
					if(array[i]> array[j]) {
						temp = array[i];
						array[i]=array[j];
					    array[j]=temp;
					  }
				}
				
			}
			for (int i = 0; i < n-1 ; i++) {
				    System.out.print (array[i]+" ");
			}
  }

}
