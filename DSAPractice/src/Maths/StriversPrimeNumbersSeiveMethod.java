package Maths;

import java.util.Arrays;

public class StriversPrimeNumbersSeiveMethod {
	
	static boolean createSieve(int n) {
		boolean[] sieve = new boolean[n+1];
		
		for(int i=0;i<=n;i++) {
			sieve[i]=true;
		}
		
		for(int i=2;i*i<=n;i++) {
			if(sieve[i]==true) {
				for(int j=i*i;j<=n;j+=i) {
					sieve[j] = false;
				}
			}
		}
		if(sieve[n]==true) return true;
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1000003;
		
		if(createSieve(n)==true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
