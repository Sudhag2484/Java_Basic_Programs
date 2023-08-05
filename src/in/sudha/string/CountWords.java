package in.sudha.string;

public class CountWords {

	public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";    

        string = string.toLowerCase();
        
        //Split the string into words using built-in function    
      String[] str = string.split(" ");
      
      for(int i=0;i<=str.length-1;i++) {
    	  int count=0;
    	  for(int j=i+1;j<=str.length-1;j++) {
    		  if(str[i].equals(str[j])) {
    			  count++;
    			  
    			  //to avoid same word count
    			  str[j]="0";
    		  }
    	  } 
    	  if(count>0 && str[i]!="0") {
    		  System.out.println(str[i]+" "+count);
    	  }
      }
	}

}
