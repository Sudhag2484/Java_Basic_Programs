package in.sudha.array;

public class MissingNum {

	public static void main(String[] args) {

		int[] arr= {1,6,5,2,4};
	      missingNumber(arr);
		
	}

	public static void missingNumber(int[] arr) {
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		
		int sumAll=0;
		for(int i=0;i<=arr.length-1;i++) {
			sumAll=sumAll+arr[i];
		}
		int missingNumber=sum-sumAll;
		System.out.println("Missing num is "+ missingNumber);
	}
}
