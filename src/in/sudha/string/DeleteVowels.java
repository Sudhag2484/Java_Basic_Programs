package in.sudha.string;

public class DeleteVowels {

	public static void main(String[] args) {

		String str="Sudharani Gudagunti";
         // str = str.toLowerCase();
          
          String newStr = str.replaceAll("[AEIOUaeiou]", "");
          System.out.println(newStr);
          
	}

}
