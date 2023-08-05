package in.sudha.array;

public class PairSum {

	public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 5, 4, 3, 9, 15};

        int sum=7;
        
        for(int i=0;i<=arr.length-1;i++) {
        	for(int j=i+1;j<=arr.length-1;j++) {
        		if(arr[i]+arr[j]==sum) {
        			System.out.println(arr[i]+" "+arr[j]);
        		}
        	}
        }
	}

}
