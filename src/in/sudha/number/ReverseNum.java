package in.sudha.number;

public class ReverseNum {

	public static void main(String[] args) {

		int n=123899,rev = 0,r;
		int temp=n;
		while(n>0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println(temp+" Reverse is :"+rev);
	}

}
