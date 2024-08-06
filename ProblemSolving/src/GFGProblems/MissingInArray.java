package GFGProblems;
/*
Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive), find the missing element. 
The array is a permutation of size n with one element missing. Return the missing element.

Example 1:
Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.

Example2:
Input: n = 2, arr[] = [1]
Output: 2
Explanation : All the numbers from 1 to 2 are present except 2.
*/

public class MissingInArray {

	public static void main(String[] args) {
		// My Code

	}

	int missingNumber(int n, int arr[]) {

		int op = 0;
		if (arr.length == 1) {
			op = n;
		} else {
			for (int i = 2; i <= (n - 1); i++) {
				if (arr[i - 1] != i) {
					op = i;
				}
			}
		}

		return op;
	}

}

/* OTHER CODE seen in COMMENTS
 * class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // Calculate the expected sum
        int expectedSum = (n * (n + 1)) / 2;

        // Return the missing number
        return expectedSum - sum;
        
    }
}
*/
