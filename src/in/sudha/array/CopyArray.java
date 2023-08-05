package in.sudha.array;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr1=new int[] {12,13,16,15,17};
		int[] arr2=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Copied array ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(" "+arr2[i]);
		}
	
	}
	}


