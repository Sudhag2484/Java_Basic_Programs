package in.sudha.array;

public class EvenPositionArr {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5, 7, 9, 8, 0};
		 System.out.println("Even postion array ");
         for(int i=1;i<=arr.length-1;i+=2) {
        	 System.out.print(" "+arr[i]);
         }
         System.out.println();
         System.out.println("Odd postion array ");
         for(int i=0;i<=arr.length-1;i+=2) {
        	 System.out.print(" "+arr[i]);
         }
         
	}
	

}
