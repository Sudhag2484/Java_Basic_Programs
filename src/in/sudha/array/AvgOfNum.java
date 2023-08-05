package in.sudha.array;

import java.util.Arrays;

public class AvgOfNum {

	public static void main(String[] args) {

		int[] arr= {12,15,17,20,10};
		
		int avg,sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		
		System.out.println("Arrays list "+Arrays.toString(arr));
		System.out.println("avg of list is "+avg);
	}

}
