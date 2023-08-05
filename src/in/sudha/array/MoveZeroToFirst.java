package in.sudha.array;

public class MoveZeroToFirst {

	public static void main(String[] args) {

		moveZeroFirst(new int[] {12,0,56,89,0,21,0,7});
	}

	private static void moveZeroFirst(int[] arr) {

		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count]=0;
			count--;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
