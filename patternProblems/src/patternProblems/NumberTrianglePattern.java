package patternProblems;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		int n=6;
		for(int i=1; i<=n ; i++) {
			for(int j=n;j>=1;j--) {
				if(j<=i) {
					System.out.print(i+" ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
