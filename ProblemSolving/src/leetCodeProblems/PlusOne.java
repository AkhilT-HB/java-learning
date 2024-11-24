package leetCodeProblems;

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
			digits[n - 1] = digits[n - 1] + 1;
			digits[n] = 0;
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
