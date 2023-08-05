package in.sudha.array;

public class OccuranceEachEle {

	public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        
        int [] fr= new int[arr.length];
       int visited=-1;
        for(int i=0;i<=arr.length-1;i++) {
        	 int count=1;
        	 for(int j=i+1;j<=arr.length-1;j++) {
        		 if(arr[i]==arr[j]) {
        			 count++;
        			 //to avoid the same counting
        			 fr[j]=visited;
        		 }
        	 }
        	 if(fr[i]!=visited) {
        		 fr[i]=count;
        	 }
        }
        for(int i=0;i<=fr.length-1;i++) {
       	 if(fr[i]!=visited) 
		System.out.println("occurance of each char is " +arr[i]+" "+fr[i]);
        }
        
        
       
		
	}

}
