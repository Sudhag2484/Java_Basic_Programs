package in.sudha.string;

public class CountVowelConsonent {

	public static void main(String[] args) {

		String str1="You are my best man in this world";
		int vCount=0,cCount=0;
		
		String str = str1.toLowerCase();
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vCount++;
				
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.println("Vowels count "+vCount);
		System.out.println("Consonent count "+cCount);
	}

}
