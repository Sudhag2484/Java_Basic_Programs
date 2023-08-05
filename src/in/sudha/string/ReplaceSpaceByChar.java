package in.sudha.string;

public class ReplaceSpaceByChar {

	public static void main(String[] args) {
		String str="You are my best man in this world";

		char ch='-';
		String string = str.replace(' ', ch);
		System.out.println("After adding specific char "+string);
		
	}

}

