import java.util.Scanner;


public class mainClass {
	 
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("-------WELCOME TO OUR STORE-------");
		System.out.print("Which book do you need??\nAns:");
		String bookName[] = {"java","C","Python"};
		String choosenBook =sc.nextLine();
		
		
		double Jprice = 220.00;
		double Cprice = 224.00;
		double Pprice = 229.00;
		if(bookName[0].toLowerCase().equals(choosenBook.toLowerCase())) {
			System.out.println("Name of the Book:"+ bookName[0]+" Book");
			CountPrice(Jprice);
		}else if(bookName[1].toLowerCase().equals(choosenBook.toLowerCase())) {
			System.out.println("Name of the Book:"+ bookName[1]+" Book");
			CountPrice(Cprice);
		}else if(bookName[2].toLowerCase().equals(choosenBook.toLowerCase())) {
			System.out.println("Name of the Book:"+ bookName[2]+" Book");
			CountPrice(Pprice);
		}else 
			System.out.println("Sorry!!! We could not find this book inside the library");
		}  

	    static void CountPrice(double bookprice){
		double studentDiscount = 0.4;
		double teacherDiscount = 0.3;
		double otherDiscount = 0.1;
		double finalPrice;
		
		System.out.println("Are you student/ teacher/ other");
		String answer = sc.nextLine(); 
		
		if(answer.toLowerCase().equals("student")) {
			finalPrice = bookprice-(studentDiscount*bookprice);
			System.out.println("Price:"+bookprice+"\nDiscount Price:"+finalPrice);
			
		}else if(answer.toLowerCase().equals("teacher")){
			finalPrice = bookprice-(teacherDiscount*bookprice);
			System.out.println("Price:"+bookprice+"\nDiscount Price:"+finalPrice);
		}else if(answer.toLowerCase().equals("other")) {
			finalPrice = bookprice-(otherDiscount*bookprice);
			System.out.println("Price:"+bookprice+"\nDiscount Price:"+finalPrice);
		}else
			System.out.println("Sorry! No discount!");	
		
	}

}
	

	

