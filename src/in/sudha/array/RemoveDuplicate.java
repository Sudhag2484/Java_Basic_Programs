package in.sudha.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 int [] arr = {1, 2, 3, 4,3,7, 8, 8, 3}; 
       // int arr[] = {-7, 1, 5, 2,2,2 -4, 3, 0};

		 Arrays.sort(arr);
		 removeDuplicateNum(arr,arr.length); 
	}
	public static void removeDuplicateNum(int[] arr, int length) {
        // Creating a second array to hold temporary elements

		int j=0;
		//to check duplicates
		for(int i=0;i<length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[length-1];
		
		//print modify array
		for(int i=0;i<j;i++) {
        System.out.print(arr[i]+" ");
		}
		
		System.out.println("******************");
		Set<Integer> set = new HashSet<Integer>();
		int[] array = {1,1,2,2,2,3,3,4,5,6,8};

		for (int num : array) {
		    set.add(num);
		}
		System.out.println(set);
		
	}
}
