package in.sudha.array;

public class RightRotation {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int n=2;//no of time to rotate
		for(int i=0;i<n;i++) {
			int j;
			int last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("Array after rotation ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
