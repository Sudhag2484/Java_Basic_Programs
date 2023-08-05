package in.sudha.number;

public class EvenSumBetweenNums {

	public static void main(String[] args) {
		int even=0;
		for(int i=0;i<30;i++) {
			if(i%2==0) {
				even+=i;
			}
		}
		System.out.println(even);
		
		System.out.println("*******************");
		int[] arr= {23,12,35,16,80,2,3};
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				even+=j;
			}
		}
		System.out.println(even);
	}

}
