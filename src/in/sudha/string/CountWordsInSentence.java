package in.sudha.string;

public class CountWordsInSentence {

	public static void main(String[] args) {

		String str="Am proud to be an Indian";
		
		int length = str.split(" ").length;
		System.out.println("No of words count in a sentence is "+length);
		
	}
}
