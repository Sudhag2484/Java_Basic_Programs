package in.sudha.string;

public class StringRotation {

	public static void main(String[] args) {

		String str1="abcde";
		String str2="deabc";
		
		if(str1.length()!=  str2.length()) {
			System.out.println("Not ration ");
		}
		else {
			str1=str1.concat(str1);
			//check wheater str2 is present in str1
			if(str1.indexOf(str2)!=0) {
				System.out.println("Second str is Roation of first String");
			}else {
				System.out.println("Second str is not Roation of first String");

			}
		}
	}

}
