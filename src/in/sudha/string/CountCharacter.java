package in.sudha.string;

public class CountCharacter {

	public static void main(String[] args) {

		String str="You are my best man in this world";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("No of charachater count "+count);
	}

}
