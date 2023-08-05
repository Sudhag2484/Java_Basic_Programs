package in.sudha.string;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
 
		String str="rock";
	//Approach 1 without sort method	
	char[] arr = str.toCharArray();
	
	char temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr);
	
	
	//Approach 1 without sort method	
        String str1="rock";
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
	    System.out.println(arr1);
	}

}
