package in.sudha.basics;

public class NumPalindrome {

	public static void main(String[] args) {

		int n=455,sum=0,temp,r;
	      temp=n;
	      while(n>0) {
	    	  r=n%10;
	    	  sum=(sum*10)+r;
	    	  n=n/10;
	      }
	      if(temp==sum) {
	    	  System.out.println(temp+" is Palindrome");
	      }
	      else {
	    	  System.out.println(temp+" is not Palindrome");

	      }
		
	}

}
