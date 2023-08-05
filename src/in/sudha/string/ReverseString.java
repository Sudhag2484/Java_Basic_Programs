package in.sudha.string;

public class ReverseString {

	public static void main(String[] args) {

		String str="Sudha Rani";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is "+rev);
		
		
		System.out.println("**************");

		      //approach -2
				char[] chArr = str.toCharArray();
				for(int i=chArr.length-1;i>=0;i--) {
					System.out.print(chArr[i]+" ");
				}
				System.out.println("**************");
				//approach-3
				StringBuffer sb = new StringBuffer(str);
				System.out.println(sb.reverse());
				
				System.out.println("**************");

				//approach-4
				StringBuilder sbuilder = new StringBuilder(str);
				System.out.println(sbuilder.reverse());
				
				
	}

}
