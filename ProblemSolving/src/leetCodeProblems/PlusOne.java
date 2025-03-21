package leetCodeProblems;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */


import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 8, 9, 9, 9 };

		int[] result = plusOne(digits);

		// System.out.println(isFullyNine(digits));

		System.out.println(Arrays.toString(result));

	}

	public static int[] plusOne(int[] digits) {

		int n = digits.length - 1;

		if (digits.length <= 1) {// Case where only one digit present in the array
			if (digits[0] == 9) {

				int[] result = new int[2];
				result[0] = 1;
				result[1] = 0;

				return result;
			} else {
				digits[0] = digits[0] + 1;
			}
		} else if (digits[n] == 9 && isFullyNine(digits)) {// Case where all the digits are 9
			int[] result = new int[digits.length + 1];
			for (int i = 0; i < result.length; i++) {
				if (i == 0) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			}
			return result;
		} else if (digits[n] == 9 && !isFullyNine(digits)) {// For the case where only last digit is 9
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] == 9) {
					digits[i] = 0;
				}else {
					digits[i] = digits[i] + 1;
					break;
				}
			}
//			digits[n - 1] = digits[n - 1] + 1;
//			digits[n] = 0;
		} else {// Case where the last digit is not 9
			digits[n] = digits[n] + 1;
		}

		return digits;
	}

	public static boolean isFullyNine(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				return false;
			}
		}

		return true;
	}
	


}

//Another simple way seen in leetcode solutions
/*
 * for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
 */
