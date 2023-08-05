package in.sudha.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5, 7, 9, 8, 0};  
		 
		 System.out.println("Original array ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(" "+arr[i]);
		 }
		 System.out.println();
		 System.out.println("Reverse Original array ");
		 for(int i=arr.length-1;i>=0;i--) {
			 System.out.print(" "+arr[i]);
		 }
		 System.out.println();
		 System.out.println("*************************");
		 //or
		 int temp;
		 for(int i=0;i<=arr.length/2;i++) {
			 temp=arr[i];
			 arr[i]=arr[arr.length-1-i];
			 arr[arr.length-1-i]=temp; 
		 }
		 System.out.println(" Reverse the array "+Arrays.toString(arr));
	}

}
