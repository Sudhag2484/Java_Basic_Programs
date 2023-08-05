package in.sudha.basics;

public class AmstrongNum {

	public static void main(String[] args) {

		int n=153,temp,sum=0,r;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is Amstrong");
		else
			System.out.println(temp+" is not Amstrong");

	}

}
