package maths;

public class StriversPrimeFactorsUsingSieve {
	
	static int N = 1000000;
	static int[] sieve = new int[N+1];
	
	//Time complexity of creating sieve : O(N log(logN))
	static void createSieve() {
		for(int i=0;i<=N;i++) {
			sieve[i]=i;
		}
		
		for(int i=2;i*i<=N;i++) {
			if(sieve[i]==i) {
				for(int j=i*i;j<=N;j+=i) {
					if(sieve[j]==j) {
						sieve[j]=i;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createSieve();
		
		int k = 36;

		//Time complexity of this while loop: O(log(k))
		while(k!=1) {
			System.out.println(sieve[k]);
			k=k/sieve[k];
		}

	}

}
