package in.sudha.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1="Grab";
		String str2="Brag";
		
		//convert lowercase
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();
	    
	    //check legth equal or not
	        if(str1.length()!=str2.length()) {
	        	System.out.println("Not Anagram");
	        }
	      
	    // convert str to charArray
	        char[] string1 = str1.toCharArray();
	        char[] string2 = str2.toCharArray();
	     
	     //sort 
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        
	    //Check anagram or not 
	        //if(Arrays.equals(string1, string2)==true) {       |0r|
	        if (String.valueOf(string1).equals(String.valueOf(string2))) {

	        	System.out.println("Both are Anagram");
	        }else {
	        	System.out.println("Not Anagram");
	        }
	}

}
