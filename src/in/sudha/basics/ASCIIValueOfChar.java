package in.sudha.basics;

import java.util.Scanner;

public class ASCIIValueOfChar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char ");
		char letter = sc.next().charAt(0);
		
		int code=letter;
	
		//int code=(int) letter; type casting
		
		System.out.println("Ascci value of chara "+letter+" is "+code);
	}
}
