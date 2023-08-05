package in.sudha.string;

public class ReverseAndViceVersaConvertion {

	public static void main(String[] args) {

        String str1= new String("I belong to a middle class family"); 
        /*
         * i/p => I belong to a middle family family
         * reverse => family family middle a to belong I
         * o/p => Family family middle a to belong i
         */
        String first=str1.substring(0, 1);
        //System.out.println(first);
        
        String[] str = str1.split(" ");
        String ans = "";
        for(int i=str.length-1;i>=0;i--) {
        	 ans += str[i] + " ";
        }
       System.out.print("After Reverse is =>"+ans);
       
       System.out.println(" ");
      String last=ans.substring(0, 1);
     // System.out.println(last);
      System.out.print(last.toUpperCase());
      
      char[] strArray = ans.toCharArray();
      for(int i=1;i<strArray.length-2;i++) {
    	  System.out.print(strArray[i]);  
      }
      System.out.print(first.toLowerCase());
        
	}

}
