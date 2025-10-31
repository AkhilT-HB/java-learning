package binarySearch;

public class NthMagicalNumberLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int a = 5;
		int b = 6;
		
		System.out.println(nthMagicalNumber(n,a,b));
	}
	public static int nthMagicalNumber(int n, int a, int b) {
		 final int MOD = 1_000_000_007;
	        long low = 1;
	        long high =(long) n * Math.min(a,b);

	        long l = lcm((long) a,(long) b);
	        long result = 0;
	        while(low<high){
	            long mid = low + ((high - low)/2);

	            long count = mid/a + mid/b - mid/l;

	            if(count<n){
	                low = mid + 1;
	            }else{
	                high = mid;
	            }
	        }
	        result = low%MOD;
	        return (int)result;
    }


	public static long lcm(long a, long b){
        long lcm = (a/gcd(a,b))*b;
        return lcm;
    }

    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
