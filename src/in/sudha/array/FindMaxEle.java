package in.sudha.array;

public class FindMaxEle {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5, 7, 9, 8, 0};

		 int max=arr[0];
		 for(int i=0;i<=arr.length-1;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("Maximum ele is "+max);
		 
		 
		 int min=arr[0];
		 for(int i=0;i<=arr.length-1;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 System.out.println("Maximum ele is "+min);
	}

}
