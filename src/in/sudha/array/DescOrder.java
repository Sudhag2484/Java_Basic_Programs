package in.sudha.array;

public class DescOrder {

	public static void main(String[] args) {
		int[] arr=new int[] {55,6,89,7,98,12,2};

		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Desc order ");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
