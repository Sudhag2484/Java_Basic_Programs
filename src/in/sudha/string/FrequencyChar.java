package in.sudha.string;

public class FrequencyChar {

	public static void main(String[] args) {

		String str="picture perfect";
	  int fr[]=new int[str.length()];
	  
	  //convert to array
	  char[] string = str.toCharArray();
	  int i,j;
	  
	  for(i=0;i<=str.length()-1;i++) {
		  fr[i]=1;
		  for(j=i+1;j<=str.length()-1;j++) {
			  if(string[i]==string[j]) {
				  fr[i]++;
				  
				  string[j]='0';
			  }
		  }
	  }
	  //dispaly each char and corresponding freq
	  for(i=0;i<=fr.length-1;i++) {
		  if(string[i]!=' '&& string[i]!='0') {
			  System.out.println(string[i]+" "+fr[i]);
		  }
	  }

}}
