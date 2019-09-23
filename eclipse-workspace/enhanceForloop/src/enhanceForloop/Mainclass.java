package enhanceForloop;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]= {3,5,7,8,16};
		
		System.out.println("Array");
         for(int i:value) {
        	 System.out.println(i);
         }
         
         System.out.println("2D array"); 
         int p[][]= {{2,6,8},
        		 	{4,6,10},
        		 	{11,3,5}};
         
         
         for(int i[]: p) {
        	 for(int j : i) {
        	 System.out.println(j);
        	 }
         }
         System.out.println("Multi-dimentional array"); 
         
	}

}
