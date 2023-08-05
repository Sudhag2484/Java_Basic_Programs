package in.sudha.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str="programming";
		
		//Approach-1 using java 8
		
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		//Approach-2 Remove duplicate Char
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			   int index = str.indexOf(ch, i+1);//check 1st occ of char in each index
			   //if same char not there index=-1			  
			   if(index==-1) {
				   sb1.append(ch);
			   }
		}
		System.out.println(sb1);
		
		//Approach -3
		StringBuilder sb2 = new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean repeat=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeat=true;
					break;
				}
			}
			if(!repeat) {
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);
		
		//Approach-4
		StringBuilder sb3 = new StringBuilder();
	     Set<Character> set = new LinkedHashSet();
	     
	     for(int i=0;i<str.length();i++) {
	    	 set.add(str.charAt(i));
	     }
       for(Character c:set) {
    	   sb3.append(c);
       }
       System.out.println(sb3);
	}
}
