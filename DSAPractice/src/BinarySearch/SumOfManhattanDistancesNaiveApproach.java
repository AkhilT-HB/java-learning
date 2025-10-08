package binarySearch;

public class SumOfManhattanDistancesNaiveApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int x[] = { -1, 1, 3, 2 };
	        int y[] = { 5, 6, 5, 3 };
	        int n = x.length;

	        System.out.println(distancesum(x, y, n));
	}

	private static int distancesum(int[] x, int[] y, int n) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int xMod = Math.abs(x[i]-x[j]);
				int yMod = Math.abs(y[i]-y[j]);
				
				sum += xMod+yMod;
			}
		}
		return sum;
	}

}
