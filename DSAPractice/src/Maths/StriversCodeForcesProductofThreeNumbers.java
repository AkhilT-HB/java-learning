package Maths;

/*
 * You are given one integer number n
. Find three distinct integers a,b,c
 such that 2≤a,b,c
 and a⋅b⋅c=n
 or say that it is impossible to do it.

If there are several answers, you can print any.

You have to answer t
 independent test cases.

Input
The first line of the input contains one integer t
 (1≤t≤100
) — the number of test cases.

The next n
 lines describe test cases. The i
-th test case is given on a new line as one integer n
 (2≤n≤109
).

Output
For each test case, print the answer on it. Print "NO" if it is impossible to represent n
 as a⋅b⋅c
 for some distinct integers a,b,c
 such that 2≤a,b,c
.

Otherwise, print "YES" and any possible such representation.

Example:
Input
5
64
32
97
2
12345
Output
YES
2 4 8 
NO
NO
NO
YES
3 5 823 

 */

public class StriversCodeForcesProductofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 64;
		
		int a=n;
		int b=n;
		int c=n;
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) a=i;
			break;
		}
		
		n = n/a;
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				if(i!=a) {
					b=Math.min(b, i);
				}
				if((n/i)!=i) {
					if((n/i) != a) {
						b=Math.min(b, n/i);
					}
				}
			}
		}
		
		c = n/b;
		System.out.println(a + " " + b + " " + c);
		if(a!=b && b!=c && c!=a) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
