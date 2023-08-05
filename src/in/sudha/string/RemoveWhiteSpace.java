package in.sudha.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="You are my best man in this world";
		
		String newStr = str.replaceAll("\\s", "");
		System.out.println("Without white space "+newStr);

	}

}
