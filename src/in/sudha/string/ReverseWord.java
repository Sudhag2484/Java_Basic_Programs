package in.sudha.string;

public class ReverseWord {

	public static void main(String[] args) {

		//approach -1
		String str="I love Programming Language";
		String[] str1 = str.split(" ");//it exclude the spaces
		System.out.println("Reversing word ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
		
	}

}
