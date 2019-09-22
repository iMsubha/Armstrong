import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		//int n= 153;
		int temp = n;
		int r, sum=0;
		
		while(n>0) {
			r=n%10;    //3
			n= n/10;   //15
			sum= sum+ r*r*r;
			System.out.println(sum);
		}
		
		if(temp == sum) {
			System.out.println("Armstrong!");
		}else
			System.out.println("Not Armstrong!");
	}

}
