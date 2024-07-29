package patternProblems;

public class NumberChangingPyramidPattern {

	public static void main(String[] args) {
		int n=6;
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(count+" ");
					count++;
				}
			}
			System.out.println();
		}
	}

}
