package in.sudha.string;

public class SwapString {

	public static void main(String[] args) {

		String str1="good";
		String str2="morning";
		
		System.out.println("Before Swaping "+str1+" "+str2);
		str1=str1+str2;
		//extract str2 from updated str1
		str2=str1.substring(0, (str1.length()-str2.length()));
		//extract st1 from updated str1
		str1=str1.substring(str2.length());
		
		System.out.println("After Swap "+str1 +" "+str2);
	}

}
