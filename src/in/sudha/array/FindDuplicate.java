package in.sudha.array;

public class FindDuplicate {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		 System.out.println("Duplicate elements are");
		 
		 for(int i=0;i<=arr.length-1;i++) {
			 for(int j=i+1;j<=arr.length-1;j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println(arr[j]);
				 }
			 }
		 }
	}

}
