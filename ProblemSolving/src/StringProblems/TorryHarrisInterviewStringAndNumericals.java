package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TorryHarrisInterviewStringAndNumericals {

	public static void main(String[] args) {
		String input = "4d3ba2c";

		String alph = "";
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				alph = alph + ch;
			} else {
				numbers.add(Integer.parseInt(String.valueOf(ch)));
			}

		}

		Optional<Integer> sumOutput = numbers.stream().reduce((a, b) -> a + b);

		if (sumOutput.isPresent()) {
			System.out.println(sumOutput);
		}

		char[] alphArr = alph.toCharArray();
		Arrays.sort(alphArr);
		System.out.println(alphArr);
	}

}
