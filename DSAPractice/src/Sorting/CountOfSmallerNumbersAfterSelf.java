package sorting;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,2,6,1};
		List<Integer> result = countSmaller(nums);
		System.out.println(result);
	}
	public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n];
        List<int[]> pairs = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            pairs.add(new int[]{nums[i],i});
        }
        mergeSort(pairs, 0, nums.length - 1, counts);

        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < n; i++){
            result.add(counts[i]);
        }
        return result;
    }

    public static void mergeSort(List<int[]> pairs, int start, int end, int[] counts){
        if(start<end){

            int mid = start + ((end-start)/2);

            mergeSort(pairs,start,mid,counts);
            mergeSort(pairs,mid+1,end,counts);

            merge(pairs,start,mid,end,counts);
        }
    }

    public static void merge(List<int[]> pairs, int start, int mid, int end, int[] counts){
         List<int[]> temp = new ArrayList<>();

         int i = start;
         int j = mid + 1;
         int k = start;

         while(i<=mid && j<=end){
            if(pairs.get(i)[0] <= pairs.get(j)[0]){
                temp.add(pairs.get(j++));  
            }else{
                counts[pairs.get(i)[1]] += end - j + 1;
                temp.add(pairs.get(i++));
            }
         }

         while(i<=mid){
            temp.add(pairs.get(i++));
         }

         while(j<=end){
            temp.add(pairs.get(j++));
         }

         for(int l=start;l<=end;l++){
            pairs.set(l,temp.get(l-start));
         }


    }

}
