package binarySearch;

public class NthUglyNumberLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int a = 2;
		int b = 3;
		int c = 4;
		
		System.out.println(nthUglyNumber(n,a,b,c));
	}
	
    public static int nthUglyNumber(long n, long a, long b, long c) {
        long low = Math.min((Math.min(a,b)),c);
        long high = n * Math.min((Math.min(a,b)),c);

        long l = lcm(lcm(a,b),c);

        while(low<high){
            long mid = low + ((high - low)/2);

            long count = mid/a + mid/b + mid/c - mid/lcm(a,b) - mid/lcm(b,c) - mid/lcm(a,c) + mid/l;

            if(count<n){
                low = mid + 1;
            }else{
                high = mid;
            }

        }

        return (int) low;
    }

    public static long lcm(long a,long b){
        long lcm = (a/gcd(a,b))*b;
        return lcm;
    }

    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
