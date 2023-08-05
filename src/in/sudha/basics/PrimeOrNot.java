package in.sudha.basics;

public class PrimeOrNot {

	public static void main(String[] args) {

         int n = 3;
		if(isPrime(n)) {
			System.out.println(n+" is"
					+ " prime");
		}else {
			System.out.println(n+"  is not prime");

		}
	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
