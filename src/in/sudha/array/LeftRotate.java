package in.sudha.array;

public class LeftRotate {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int n=2;//no of time to rotate
		for(int i=0;i<n;i++) {
			int j;
			int first=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println("Array after rotation ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
