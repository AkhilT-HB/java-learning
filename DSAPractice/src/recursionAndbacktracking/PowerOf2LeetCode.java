package recursionAndbacktracking;

public class PowerOf2LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		System.out.println(isPower2(n));
	}
	
	static boolean isPower2(int n) {
		if(n<=0) return false;
		
		if(n==1) return true;
		
		if(n%2 != 0) return false;
		
		return isPower2(n/2);
	}

}
