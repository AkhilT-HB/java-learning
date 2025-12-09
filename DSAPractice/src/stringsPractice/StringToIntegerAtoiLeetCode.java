package stringsPractice;

public class StringToIntegerAtoiLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "42";
		//String s = "+1";
		//String s = "-91283472332";
		//String s = "words and 987";
		
		System.out.println(myAtoi(s));
	}
	public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if( i==n ) return 0;

        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;

    }

}
