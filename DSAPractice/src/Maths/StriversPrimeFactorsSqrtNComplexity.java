package maths;
//Print all prime factors of given number N
public class StriversPrimeFactorsSqrtNComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}
		
		if(n>1) {
			System.out.println(n);
		}

	}

}
