package in.sudha.number;

public class NumPerfectSquare {

	public static void main(String[] args) {
		
		int num=4;
		if(isPrefect(num)) {
			System.out.println("Perfect Sq");
		}else {
			System.out.println("Not perfect Sq");
		}

	}

	private static boolean isPrefect(int num) {
		 for(int i=1;i*i<=num;i++) {
			 if(num%2==0 && num/i==i) {
				 return true;
			 }
		 }
		return false;
	}
}
