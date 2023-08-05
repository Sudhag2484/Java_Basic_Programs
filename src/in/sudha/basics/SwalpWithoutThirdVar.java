package in.sudha.basics;

public class SwalpWithoutThirdVar {

	public static void main(String[] args) {
		int a=68;
		int b=89;
		System.out.println("Before swap a and b is "+a+" "+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		System.out.println("After swap a and b is "+a+" "+b);
	}

}
