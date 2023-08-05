package in.sudha.string;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String str1="Great Powerer";
		
      char[] str = str1.toCharArray();		
		
      for(int i=0;i<=str.length-1;i++) {
    	  int count=0;
    	  for(int j=i+1;j<=str.length-1;j++) {
    		  if(str[i]==str[j] && str[i]!=' ') {
    			  count++;
    			  //Set string[j] to 0 to avoid printing visited character    
    			  str[j]='0';
    		  }
    	  }
          //A character is considered as duplicate if count is greater than 1    
         if(count> 0 && str[i]!='0') {
        	 System.out.println(" Finded the duplicate char is "+str[i]);
         }
      }
	}

}
