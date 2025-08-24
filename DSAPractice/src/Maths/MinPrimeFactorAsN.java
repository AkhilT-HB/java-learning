package Maths;

import java.util.ArrayList;

public class MinPrimeFactorAsN {
	
	static int N = 1000000;
	static int[] sieve = new int[N+1];
	
	static int createSieve(int k) {
		for(int i=2;i<=N;i++) {
			sieve[i]=1;
		}
		
		for(int i=2;i*i<=N;i++) {
			if(sieve[i]==1) {
				for(int j=i*i;j<=N;j+=i) {
					if(sieve[j]!=0) {
						sieve[i]=sieve[i]+1;
						sieve[j]=0;
					}
				}
			}
		}
		
		return sieve[k];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		System.out.println(createSieve(k));
	}

}
