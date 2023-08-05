package in.sudha.array;

public class SumEle {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5, 7, 9, 8, 0};

		 int sum=0;
		 for(int i=0;i<=arr.length-1;i++) {
			 sum=sum+arr[i];
		 }
		 System.out.println("Sum of all ele in array list is "+sum);
	}

}
