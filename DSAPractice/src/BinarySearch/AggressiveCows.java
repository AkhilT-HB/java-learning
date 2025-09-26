package binarySearch;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = { 6,4,3,16,20,7,18,10 };
		int k = 5;
		Arrays.sort(stalls);
		int n = stalls.length;
		int low = 1;
		int high = stalls[n - 1] - stalls[0];
		int minDistance = 0;
		while (low <= high) {
			int dist = low + ((high - low) / 2);

			if (canPlace(stalls, dist, k)) {
				minDistance = dist;
				low = dist + 1;
			} else {
				high = dist - 1;
			}
		}

		System.out.println(minDistance);
	}
	
	static boolean canPlace(int[] stalls, int dist, int k){
        int next = stalls[0]+dist;
        k--;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]>=next && k>0){
                next = stalls[i]+dist;
                k--;
            } 
        }
        if(k==0) return true;
        return false;
    }

}
