package in.sudha.array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
   
		moveZeroEnd(new int[] {12,0,4,0,26,9,0,3});
	}

	private static void moveZeroEnd(int[] arr) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

}
