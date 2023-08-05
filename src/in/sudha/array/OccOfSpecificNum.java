package in.sudha.array;

public class OccOfSpecificNum {

	public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  

        int count=0;
        int num=2;
        for(int i=0;i<=arr.length-1;i++) {
        	if(num==arr[i]) {
        		count++;
        	}
        }
        System.out.println("The occurance of "+num+ " is "+ count+" times");
	}

}
