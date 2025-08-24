package Maths;

import java.util.ArrayList;

/*
 * Input
An integer stating the number of queries Q (equal to 50000), and Q lines follow, each containing one integer K between 1 and 5000000 inclusive.

Output
Q lines with the answer of each query: the Kth prime number.

Example:
Input:
7
1
10
100
1000
10000
100000
1000000

Output:
2
29
541
7919
104729
1299709
15485863
 */

public class StriversFindingKthPrimeNumber {
	
	static int N = 86028121;
	static boolean[] sieve = new boolean[N+1];
	
	static int createSieve(int k) {
		for(int i=2;i<=N;i++) {
			sieve[i]=true;
		}
		
		for(int i=2;i*i<=N;i++) {
			if(sieve[i]==true) {
				for(int j=i*i;j<=N;j+=i) {
					sieve[j]=false;
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2;i<=N;i++) {
			if(sieve[i]==true) {
				list.add(i);
			}
		}
		
		return list.get(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createSieve(5));
	}

}
