package patternProblems;

public class HollowReverseTrianglePattern {

	public static void main(String[] args) {
		int n=6;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				if(i==n||k==1||k==(2*i)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
